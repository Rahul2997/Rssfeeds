package com.example.com.rssfeeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TableRow;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().setTitle("Sports");
        setContentView(R.layout.activity_4);

        /*if(getIntent().getBooleanExtra("exit",false)){
            finish();
            System.exit(0);
        }*/

        TableRow tr1=(TableRow)findViewById(R.id.row1);
        TableRow tr5=(TableRow)findViewById(R.id.row5);
        TableRow tr10=(TableRow)findViewById(R.id.row10);

        tr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",1);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",5);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",10);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbarsports,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.Homepage:
                i = new Intent(getBaseContext(), Activity2.class);
                startActivity(i);
                return showToast("Homepage");

            case R.id.Settings:
                i = new Intent(getBaseContext(), Activity8.class);
                startActivity(i);
                return showToast("Settings");

            case R.id.Exit:
                File f = getBaseContext().getFileStreamPath("bookmark.txt");
                if (f.exists()) {
                    try {
                        FileInputStream fia = null;
                        try {
                            fia = openFileInput("bookmark.txt");
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        int c;
                        String temp = "";
                        while ((c = fia.read()) > 0) {
                            temp += Character.toString((char) c);
                        }

                        if (temp.equals("1"))
                            i = new Intent(getBaseContext(), Activity4.class);
                        else if (temp.equals("2"))
                            i = new Intent(getBaseContext(), Activity5.class);
                        else if (temp.equals("3"))
                            i = new Intent(getBaseContext(), Activity6.class);
                        else
                            i = new Intent(getBaseContext(), Activity7.class);

                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("exit", true);
                        startActivity(i);

                        //i = new Intent(getBaseContext(), Activity2.class);

                        startActivity(i);

                        return showToast("Exit");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            default:
                return false;
        }
    }

    public boolean showToast(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
        return true;
    }
}