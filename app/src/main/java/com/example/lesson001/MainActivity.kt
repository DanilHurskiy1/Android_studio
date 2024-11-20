package com.example.lesson001

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textHello: TextView
    lateinit var button: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initViewCompat()

        textHello = findViewById(R.id.textHello)
        button = findViewById(R.id.button)

        textHello.text = "Hello bro"

        button.setOnClickListener {
            counter++
            textHello.text = "Clicked $counter times"
            button.text = "Тапай хомяка!!!!!"
        }
    }

    private fun initViewCompat() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}