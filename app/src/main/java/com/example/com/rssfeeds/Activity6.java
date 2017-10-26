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

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().setTitle("Technology");
        setContentView(R.layout.activity_6);

        /*if(getIntent().getBooleanExtra("exit",false)){
            finish();
            System.exit(0);
        }*/

        TableRow tr3=(TableRow)findViewById(R.id.row3);
        TableRow tr7=(TableRow)findViewById(R.id.row7);
        TableRow tr12=(TableRow)findViewById(R.id.row12);

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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbartechnology,menu);
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
