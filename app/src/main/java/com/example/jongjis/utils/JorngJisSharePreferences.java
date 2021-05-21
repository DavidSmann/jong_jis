package com.example.jongjis.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class JorngJisSharePreferences {
    private static final String APP_SHARED_PREFS = "JorngJis";
    private SharedPreferences sharedPrefs;
    private static JorngJisSharePreferences mAppShareConstant;
    private Context mContext = null;

    public enum SharedPreKeyType {
        TOKEN,
        ACCESS_TOKEN,
    }

    private JorngJisSharePreferences(Context context) {
        mContext = context;
        this.sharedPrefs = mContext.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
    }

    public synchronized static JorngJisSharePreferences getConstant(Context context) {
        if (null == mAppShareConstant) {
            mAppShareConstant = new JorngJisSharePreferences(context);
        }
        return mAppShareConstant;
    }

    private void clearSharePreferenceAll(){
        sharedPrefs.edit().clear().apply();
    }

    public void clearAll() {
        clearSharePreferenceAll();
    }


    public void setToken(String token) {
        sharedPrefs.edit().putString(SharedPreKeyType.TOKEN.toString(), token).apply();
    }

    public String getToken() {
        return sharedPrefs.getString(SharedPreKeyType.TOKEN.toString(), "");
    }

    public void setAccessToken(String accessToken) {
        sharedPrefs.edit().putString(SharedPreKeyType.ACCESS_TOKEN.toString(), accessToken).apply();
    }

    public String getAccessToken() {
        return sharedPrefs.getString(SharedPreKeyType.ACCESS_TOKEN.toString(), "");
    }

}
