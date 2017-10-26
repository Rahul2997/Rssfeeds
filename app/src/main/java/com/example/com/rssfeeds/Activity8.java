package com.example.com.rssfeeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity8 extends AppCompatActivity {

    public String book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().setTitle("Settings");
        setContentView(R.layout.activity_8);

        /*if (getIntent().getBooleanExtra("exit", false)) {
            finish();
            System.exit(0);
        }*/

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg1);
        Button btn = (Button) findViewById(R.id.btn1);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {

                    case R.id.rbsp:
                        showToast("Sports");
                        book = "1";
                        break;

                    case R.id.rbent:
                        showToast("Entertainment");
                        book = "2";
                        break;

                    case R.id.rbtech:
                        showToast("Technology");
                        book = "3";
                        break;

                    case R.id.rbpol:
                        showToast("Politics");
                        book = "4";
                        break;
                }
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    //type 1

                    FileOutputStream fOut = null;
                    try {
                        fOut = openFileOutput("bookmark.txt",
                                MODE_PRIVATE);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        fOut.write(book.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    fOut.close();
                    Toast.makeText(getBaseContext(), "Bookmark Saved", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }


            public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbarsubmit,menu);
        return super.onCreateOptionsMenu(menu);}


    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.Homepage:
                i = new Intent(getBaseContext(), Activity2.class);
                startActivity(i);
                return showToast("Homepage");

            case R.id.Exit:
                i=new Intent(getBaseContext(),Activity2.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.putExtra("exit", true); startActivity(i);
                return showToast("Exit");

            default:
                return false;

        }
    }

    public boolean showToast(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
        return true;
    }
}
