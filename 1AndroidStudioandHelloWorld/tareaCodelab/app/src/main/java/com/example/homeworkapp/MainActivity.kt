package com.example.homeworkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "Log de informacion");
        Log.e("MainActivity", "Log de error");
        Log.d("MainActivity", "Log de Debug");
    }
}