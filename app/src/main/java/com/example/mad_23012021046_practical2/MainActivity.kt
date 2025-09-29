package com.example.mad_23012021046_practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        showMessage("onCreate method called")
    }


    private fun showMessage(msg: String) {
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method called")
    }
}
