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

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().setTitle("Politics");
        setContentView(R.layout.activity_7);

        /*if(getIntent().getBooleanExtra("exit",false)){
            finish();
            System.exit(0);
        }*/

        TableRow tr4=(TableRow)findViewById(R.id.row4);
        TableRow tr6=(TableRow)findViewById(R.id.row6);
        TableRow tr9=(TableRow)findViewById(R.id.row9);

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
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbarpolitics,menu);
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
