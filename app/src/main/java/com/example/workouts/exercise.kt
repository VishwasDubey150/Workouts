package com.example.workouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        supportActionBar?.hide()
    }
}