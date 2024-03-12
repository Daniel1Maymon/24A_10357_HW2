package com.example.vibration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textview.MaterialTextView;

public class TimerActivity1 extends AppCompatActivity {
    private ExtendedFloatingActionButton timer_FAB_start;
    private ExtendedFloatingActionButton timer_FAB_stop;
    private MaterialTextView timer_LBL_time;

    private long startTime;

    private static final long DELAY=0;
    final Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            handler.postDelayed(this, DELAY);
            updateTimerUI();
        }
    };

    private void updateTimerUI() {
        long currentMillis = System.currentTimeMillis() - startTime;
        int seconds = (int)(currentMillis/1000);
        int minutes = seconds / 60;
        seconds %=60;
        int hours = minutes / 60;
        minutes %=60;
        hours %=24;

        timer_LBL_time.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));

        Log.d("Current Time", "" + System.currentTimeMillis());

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
        handler.postDelayed(runnable, DELAY);
    }

    private void stopTimer(){
        handler.removeCallbacks(runnable);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer1);

        findViews();
        initViews();
    }

    private void initViews() {
        timer_FAB_start.setOnClickListener(v -> startTimer());
        timer_FAB_stop.setOnClickListener(v -> stopTimer());
    }

    private void findViews() {
        timer_FAB_start = findViewById(R.id.timer_FAB_start);
        timer_FAB_stop = findViewById(R.id.timer_FAB_end);
        timer_LBL_time = findViewById(R.id.timer_LBL_time);
    }
}