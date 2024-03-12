package com.example.a24a_10357_l05.Utilities;

import static androidx.core.content.ContextCompat.getSystemService;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Toast;

import com.example.a24a_10357_l05.App;

public class SignalManager {
    private static SignalManager instance = null;

    private Context context;

    private Vibrator vibrator;

    private SignalManager(Context context){
        this.context = context;
    }

    public static SignalManager getInstance(){
        return instance;
    }

    public static void init(Context context) {
        synchronized (SignalManager.class){
            if(instance == null){
                instance = new SignalManager(context);
            }
        }
    }

    public void vibrate(long milliseconds){
//        Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            vibrator.vibrate(VibrationEffect.createOneShot(milliseconds, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            vibrator.vibrate(milliseconds);
        }
    }

    public void toast(String message){
        Toast
                .makeText(context, message, Toast.LENGTH_SHORT)
                .show();
    }
}
