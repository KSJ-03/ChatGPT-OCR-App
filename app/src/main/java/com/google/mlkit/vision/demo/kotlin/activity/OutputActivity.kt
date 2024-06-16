package com.google.mlkit.vision.demo.kotlin.activity

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import com.google.mlkit.vision.demo.R

class OutputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val inputReceived = intent.getStringExtra("input")
        val outputReceived = intent.getStringExtra("output")

        findViewById<TextView>(R.id.inputTv).apply {
            text = inputReceived
            movementMethod = ScrollingMovementMethod()
        }
        findViewById<TextView>(R.id.outputTv).apply {
            text = outputReceived
            movementMethod = ScrollingMovementMethod()
        }
        findViewById<TextView>(R.id.queryTv).paintFlags = Paint.UNDERLINE_TEXT_FLAG
        findViewById<TextView>(R.id.responseTv).paintFlags = Paint.UNDERLINE_TEXT_FLAG

        findViewById<Button>(R.id.giveAnotherInputBtn).setOnClickListener {
            val intent = Intent(this,OptionSelectionActivity::class.java)
            startActivity(intent)
        }
    }
}