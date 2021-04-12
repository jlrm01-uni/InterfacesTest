package com.example.interfacestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.interfacestest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var value = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        val textView = binding.textView

        // Estos son mis botones
        binding.buttonSumar.setOnClickListener {
            value+=1
            textView.text = value.toString()
        }

        binding.buttonRestar.setOnClickListener {
            value-=1
            textView.text = value.toString()
        }

        binding.buttonReset.setOnClickListener {
            value=0
            textView.text = value.toString()
        }

        binding.buttonSmallerFont.setOnClickListener {
            textView.textSize = 20f
        }

        binding.buttonBiggerFont.setOnClickListener {
            textView.textSize = 250f
        }

        binding.buttonHideShow.setOnClickListener {
            textView.isVisible = !textView.isVisible
        }
    }
}