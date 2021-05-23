package com.example.demo_activityforresult

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btn_finish = findViewById<Button>(R.id.btn_finish)

        btn_finish.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}