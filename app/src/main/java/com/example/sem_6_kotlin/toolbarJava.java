package com.example.sem_6_kotlin;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowCompat;

public class toolbarJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.group) {
            Toast.makeText(this, "Create a new group", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.broadcast) {
            Toast.makeText(this, "Create a new broadcast", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Linked) {
            Toast.makeText(this, "Check linked devices", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.settings) {
            Toast.makeText(this, "Go to settings", Toast.LENGTH_SHORT).show();
        } else {
            return super.onOptionsItemSelected(item); // Handle unknown menu items
        }
        return true;
    }
}
