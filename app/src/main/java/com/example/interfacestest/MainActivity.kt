package com.example.interfacestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        // Estos son mis botones
        findViewById<Button>(R.id.buttonSumar).setOnClickListener {
            value+=1
            textView.text = value.toString()
        }

        findViewById<Button>(R.id.buttonRestar).setOnClickListener {
            value-=1
            textView.text = value.toString()
        }

        findViewById<Button>(R.id.buttonReset).setOnClickListener {
            value=0
            textView.text = value.toString()
        }

        findViewById<Button>(R.id.buttonSmallerFont).setOnClickListener {
            textView.textSize = 20f
        }

        findViewById<Button>(R.id.buttonBiggerFont).setOnClickListener {
            textView.textSize = 250f
        }

        findViewById<Button>(R.id.buttonHideShow).setOnClickListener {
            textView.isVisible = !textView.isVisible
        }
    }
}