package com.example.sem_6_kotlin

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Toolbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toolbar)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.group -> Toast.makeText(this, "Create a new group", Toast.LENGTH_SHORT).show()
            R.id.broadcast -> Toast.makeText(this, "Create a new broadcast", Toast.LENGTH_SHORT).show()
            R.id.Linked -> Toast.makeText(this, "Check linked devices", Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this, "Go to settings", Toast.LENGTH_SHORT).show()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}
