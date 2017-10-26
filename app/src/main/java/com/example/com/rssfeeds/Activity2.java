package com.example.com.rssfeeds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.MenuItem;
import android.widget.TableRow;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.example.com.rssfeeds.R.id.Entertainment;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().setTitle("Homepage");
        setContentView(R.layout.activity_2);
        if(getIntent().getBooleanExtra("exit",false)){
            finish();
            System.exit(0);
        }

        File f = getBaseContext().getFileStreamPath("bookmark.txt");
        if(f.exists()) {
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
                Intent i;
                if (temp.equals("1"))
                    i = new Intent(getBaseContext(), Activity4.class);
                else if (temp.equals("2"))
                    i = new Intent(getBaseContext(), Activity5.class);
                else if (temp.equals("3"))
                    i = new Intent(getBaseContext(), Activity6.class);
                else
                    i = new Intent(getBaseContext(), Activity7.class);
                startActivity(i);
            } catch (IOException e) {
                e.printStackTrace();
            }




        }
        else
        {

            TableRow tr1=(TableRow)findViewById(R.id.row1);
        TableRow tr2=(TableRow)findViewById(R.id.row2);
        TableRow tr3=(TableRow)findViewById(R.id.row3);
        TableRow tr4=(TableRow)findViewById(R.id.row4);
        TableRow tr5=(TableRow)findViewById(R.id.row5);
        TableRow tr6=(TableRow)findViewById(R.id.row6);
        TableRow tr7=(TableRow)findViewById(R.id.row7);
        TableRow tr8=(TableRow)findViewById(R.id.row8);
        TableRow tr9=(TableRow)findViewById(R.id.row9);
        TableRow tr10=(TableRow)findViewById(R.id.row10);
        TableRow tr11=(TableRow)findViewById(R.id.row11);
        TableRow tr12=(TableRow)findViewById(R.id.row12);

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

        tr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",2);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",3);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",4);
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

        tr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",6);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",7);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",8);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",9);
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

        tr11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",11);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        tr12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putInt("row_no",12);
                Intent i=new Intent(getBaseContext(),Activity3.class);
                i.putExtras(b);
                startActivity(i);
            }
        });


    }

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar2,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch(item.getItemId()){
            case R.id.Sports:
                i=new Intent(getBaseContext(),Activity4.class);
                startActivity(i);
                return showToast("Sports");

            case Entertainment:
                i=new Intent(getBaseContext(),Activity5.class);
                startActivity(i);
                return showToast("Entertainment");

            case R.id.Technology:
                i=new Intent(getBaseContext(),Activity6.class);
                startActivity(i);
                return showToast("Technology");

            case R.id.Politics:
                i=new Intent(getBaseContext(),Activity7.class);
                startActivity(i);
                return showToast("Politics");

            case R.id.Settings:
                i=new Intent(getBaseContext(),Activity8.class);
                startActivity(i);
                return showToast("Settings");

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