package com.example.a24a_10357_l05.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.a24a_10357_l05.App;

// Singleton version
public class SharedPreferencesManagerV3 {

    private static final String DB_FILE = "DB_FILE";
    private static SharedPreferences sharedPref;
    private static volatile SharedPreferencesManagerV3 instance = null;

    private SharedPreferencesManagerV3(Context context){
        this.sharedPref = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
    }

    public static SharedPreferencesManagerV3 getInstance(){
        return instance;
    }
    public static void putInt(String key, int value){
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(key, value);
        editor.apply();
    }
    public static int getInt(String key, int defaultValue){
        return sharedPref.getInt(key, defaultValue);
    }
    public static void putString (String key, String value){
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.apply();
    }
    public static String getString (String key, String defaultValue){
        return sharedPref.getString(key, defaultValue);
    }

    public static void init(Context context) {
        synchronized (SharedPreferencesManagerV3.class){
            if(instance == null){
                instance = new SharedPreferencesManagerV3(context);
            }
        }
    }
}
