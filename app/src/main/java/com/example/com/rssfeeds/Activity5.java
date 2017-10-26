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

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().setTitle("Entertainment");
        setContentView(R.layout.activity_5);

        /*if(getIntent().getBooleanExtra("exit",false)){
            finish();
            System.exit(0);
        }*/

        TableRow tr2=(TableRow)findViewById(R.id.row2);
        TableRow tr8=(TableRow)findViewById(R.id.row8);
        TableRow tr11=(TableRow)findViewById(R.id.row11);

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
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbarentertainment,menu);
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
                i.putExtra("exit", true);
                startActivity(i);
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