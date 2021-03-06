package com.example.alumno.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        // se asocia el listener del buscador con el buscador
        MenuItem mi = menu.findItem(R.id.buscar);
        SearchView sv = (SearchView) MenuItemCompat.getActionView(mi);
        sv.setOnQueryTextListener(this);

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

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    Log.d("menu", "no se tiene permio para realizar llamadas");
                }
                else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:4444"));
                    startActivity(callIntent);
                    Log.d("menu", "se llamò por telèfono");
                }

                break;
            case R.id.op3:
                Log.d("menu", "click 3");
                Intent i = new Intent(this, OtraActivity.class);
                startActivity(i);
                break;
            case android.R.id.home:
                Log.d("menu", "click home");
                break;
            default:
                Log.d("menu", "click nada");
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.d("busqueda submit", query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.d("busqueda change", newText);
        return false;
    }
}
