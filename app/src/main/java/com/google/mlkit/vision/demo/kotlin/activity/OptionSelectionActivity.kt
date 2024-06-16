package com.google.mlkit.vision.demo.kotlin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.mlkit.vision.demo.R

class OptionSelectionActivity : AppCompatActivity() {
    lateinit var optionSelected: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_selection)

        findViewById<Button>(R.id.nextScreenBtn).setOnClickListener {
            val intent = Intent(
                this,
                StillImageActivity::class.java
            )
            startActivity(intent)
        }
    }
}