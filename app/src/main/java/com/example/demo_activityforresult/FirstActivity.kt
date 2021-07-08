package com.example.demo_activityforresult

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btn_finish = findViewById<Button>(R.id.btn_finish)

        btn_finish.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
        Log.e("life-cycle-1", "oncreate")
    }
    override fun onStart() {
        super.onStart()
        Log.e("life-cycle-2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("life-cycle-2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("life-cycle-2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("life-cycle-2", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("life-cycle-2", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("life-cycle-2", "onDestroy")
    }
}