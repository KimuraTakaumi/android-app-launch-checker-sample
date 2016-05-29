package com.hatenablog.techium.android_app_launch_checker_sample;

import android.support.v4.app.AppLaunchChecker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(AppLaunchChecker.hasStartedFromLauncher(this)){
            Log.d("AppLaunchChecker","2回目以降");
        } else {
            Log.d("AppLaunchChecker","はじめてアプリを起動した");
        }

        AppLaunchChecker.onActivityCreate(this);
    }
}
