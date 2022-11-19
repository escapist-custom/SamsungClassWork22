package com.samsung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TEST_LOG = "test_log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TEST_LOG, "onCreate is stated");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TEST_LOG, "onStart is stated");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TEST_LOG, "onResume is stated");
    }

}