package com.example.demo_activityforresult

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn_submit = findViewById<Button>(R.id.btn_submit)
        val et_name = findViewById<EditText>(R.id.et_name)
        val et_mail = findViewById<EditText>(R.id.et_name)

        btn_submit.setOnClickListener {
            val intent = Intent()
            intent.putExtra(MainActivity.NAME, et_name.text.toString())
            intent.putExtra(MainActivity.MAIL, et_mail.text.toString())

            setResult(Activity.RESULT_OK, intent)
            finish()

        }
    }
}