package com.example.interfacestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text_view = findViewById<TextView>(R.id.textView)

        // Estos son mis botones
        findViewById<Button>(R.id.buttonSumar).setOnClickListener {
            value+=1
            text_view.text = value.toString()
        }

        findViewById<Button>(R.id.buttonRestar).setOnClickListener {
            value-=1
            text_view.text = value.toString()
        }

        findViewById<Button>(R.id.buttonReset).setOnClickListener {
            value=0
            text_view.text = value.toString()
        }

        findViewById<Button>(R.id.buttonSmallerFont).setOnClickListener {
            text_view.textSize = 20f
        }

        findViewById<Button>(R.id.buttonBiggerFont).setOnClickListener {
            text_view.textSize = 250f
        }

        findViewById<Button>(R.id.buttonHideShow).setOnClickListener {
            text_view.isVisible = !text_view.isVisible
        }
    }
}