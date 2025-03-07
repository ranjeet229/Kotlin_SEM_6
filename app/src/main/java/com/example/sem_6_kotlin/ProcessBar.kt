package com.example.sem_6_kotlin

import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProcessBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_process_bar)
        val progressbar = findViewById<ProgressBar>(R.id.progressbar)
            progressbar.max=1000;
            val currentProgress=600;

        ObjectAnimator.ofInt(progressbar,"Progress",currentProgress)
            .setDuration(3000).start();
    }
}