package com.example.alumno.myapplication;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class OtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        // habilitando el botòn back
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.op1:
                Log.d("menu", "click 1");
                break;
            case R.id.op2:
                Log.d("menu", "click 2");
                break;
            case R.id.op3:
                Log.d("menu", "click 3");
                break;
            case android.R.id.home:
                Log.d("menu", "click home");
                break;
            default:
                Log.d("menu", "click nada");
        }

        return super.onOptionsItemSelected(item);
    }

}
