package com.example.a24a_10357_l05;

import android.app.Application;
import android.util.Log;

import com.example.a24a_10357_l05.Utilities.SharedPreferencesManagerV3;
import com.example.a24a_10357_l05.Utilities.SignalManager;

public class App extends Application {

    @Override
    public void onCreate() {
        Log.d(":: App class :: onCreate()", "");
        super.onCreate();

        SharedPreferencesManagerV3.init(this);
        SignalManager.init(this);
    }
}
