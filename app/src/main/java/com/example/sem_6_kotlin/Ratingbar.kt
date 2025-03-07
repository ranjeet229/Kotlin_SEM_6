package com.example.sem_6_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Ratingbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ratingbar)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button = findViewById<Button>(R.id.button1)
        val ratingScale = findViewById<TextView>(R.id.textView)

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            ratingScale.text = when (rating.toInt()) {
                1 -> "Very Bad"
                2 -> "Bad"
                3 -> "Good"
                4 -> "Very Good"
                5 -> "Excellent"
                else -> "Default"
            }
        }

        button.setOnClickListener {
            val message = "Rating is: ${ratingBar.rating}"
            Toast.makeText(this@Ratingbar, message, Toast.LENGTH_LONG).show()
        }
    }
}
