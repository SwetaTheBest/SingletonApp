package com.swetajain.singletonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Debug: ${MySingleton.SingletonUser.hashCode() }")
        println("Debug: ${MySingleton.SingletonUser.userName}")
    }
}
