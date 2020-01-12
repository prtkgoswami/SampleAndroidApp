package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_secondpage.*

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        prevBtn.setOnClickListener {
            Log.d("pratik", "previous btn clicked")
            onBackPressed()
        }
    }
}