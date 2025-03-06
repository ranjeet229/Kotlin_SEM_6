package com.example.sem_6_kotlin

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ratingbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ratingbar)
        val ratingbar=findViewById<RatingBar>(R.id.ratingBar)
        val tvResult=findViewById<TextView>(R.id.tvResult);

        ratingbar.setOnRatingBarChangeListener { _, rating, _ ->
            tvResult.text = "Current Rating: $rating"
        }
    }
}
