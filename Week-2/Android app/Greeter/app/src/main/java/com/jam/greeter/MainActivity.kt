package com.jam.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input = findViewById<EditText>(R.id.Input)
        var output = findViewById<TextView>(R.id.label)
        var button = findViewById<Button>(R.id.greet)

        button.setOnClickListener {
            var optext = input.text.toString()
            output.text = "Hello $optext!"
        }
    }


}