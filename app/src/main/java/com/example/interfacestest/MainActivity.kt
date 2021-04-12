package com.example.interfacestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Estos son mis botones
        findViewById<Button>(R.id.buttonSumar).setOnClickListener(this)
        findViewById<Button>(R.id.buttonRestar).setOnClickListener(this)
        findViewById<Button>(R.id.buttonReset).setOnClickListener(this)
        findViewById<Button>(R.id.buttonSmallerFont).setOnClickListener(this)
        findViewById<Button>(R.id.buttonBiggerFont).setOnClickListener(this)
        findViewById<Button>(R.id.buttonHideShow).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val text_view = findViewById<TextView>(R.id.textView)

        when (v?.id) {
            R.id.buttonSumar -> {
                value+=1
                text_view.text = value.toString()
            }
            R.id.buttonRestar -> {
                value-=1
                text_view.text = value.toString()
            }
            R.id.buttonReset -> {
                value=0
                text_view.text = value.toString()
            }
            R.id.buttonSmallerFont -> {
                text_view.textSize = 20f
            }
            R.id.buttonBiggerFont -> {
                text_view.textSize = 250f
            }
            R.id.buttonHideShow -> {
                text_view.isVisible = !text_view.isVisible
            }
        }
    }
}