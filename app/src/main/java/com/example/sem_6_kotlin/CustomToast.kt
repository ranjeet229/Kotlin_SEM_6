package com.example.sem_6_kotlin

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomToast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_toast)

        val toastButton = findViewById<Button>(R.id.button)
        toastButton.setOnClickListener {
            showToast()
        }
    }
    private fun showToast() {
        val inflater: LayoutInflater =layoutInflater
        val view: View =inflater.inflate(R.layout.custom_toast,findViewById(R.id.toastRoot))
        val toast:Toast=Toast(this)
        toast.setGravity(Gravity.BOTTOM or Gravity.FILL_HORIZONTAL,0,0)
        toast.duration=Toast.LENGTH_LONG
        toast.view=view
        toast.show()


    }
}