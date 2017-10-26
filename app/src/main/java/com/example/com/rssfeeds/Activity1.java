package com.example.com.rssfeeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Thread background = new Thread() {
            public void run() {

                try {

                    sleep(5 * 1000);

                    Intent i = new Intent(getBaseContext(), Activity2.class);
                    startActivity(i);

                    finish();
                } catch (Exception e) {

                }
            }
        };

        background.start();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

}