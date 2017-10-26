package com.example.com.rssfeeds;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().setTitle("Newspage");
        setContentView(R.layout.activity_3);

        Bundle b = getIntent().getExtras();
        int row = b.getInt("row_no");

        TextView t = (TextView) findViewById(R.id.tv1);
        ImageView v = (ImageView) findViewById(R.id.iv1);

        String arr[] = getResources().getStringArray(R.array.news_array);

        switch (row) {
            case 1:
                t.setText(arr[0]);
                v.setImageResource(R.drawable.sp1);
                break;
            case 2:
                t.setText(arr[1]);
                v.setImageResource(R.drawable.ent1);
                break;
            case 3:
                t.setText(arr[2]);
                v.setImageResource(R.drawable.tech1);
                break;
            case 4:
                v.setImageResource(R.drawable.pol1);
                t.setText(arr[3]);
                break;
            case 5:
                v.setImageResource(R.drawable.sp2);
                t.setText(arr[4]);
                break;
            case 6:
                v.setImageResource(R.drawable.pol2);
                t.setText(arr[5]);
                break;
            case 7:
                v.setImageResource(R.drawable.tech2);
                t.setText(arr[6]);
                break;
            case 8:
                v.setImageResource(R.drawable.ent2);
                t.setText(arr[7]);
                break;
            case 9:
                v.setImageResource(R.drawable.pol3);
                t.setText(arr[8]);
                break;
            case 10:
                v.setImageResource(R.drawable.sp3);
                t.setText(arr[9]);
                break;
            case 11:
                v.setImageResource(R.drawable.ent3);
                t.setText(arr[10]);
                break;
            case 12:
                v.setImageResource(R.drawable.tech3);
                t.setText(arr[11]);
                break;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbarnewspage,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.Homepage:
                i = new Intent(getBaseContext(), Activity2.class);
                startActivity(i);
                finish();
                return showToast("Homepage");

            case R.id.Settings:
                i = new Intent(getBaseContext(), Activity8.class);
                startActivity(i);
                finish();
                return showToast("Settings");

            case R.id.Exit:
                i=new Intent(getBaseContext(),Activity2.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.putExtra("exit", true);
                startActivity(i);
                finish();
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