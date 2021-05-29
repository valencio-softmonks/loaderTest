package com.valencio.squareloader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val view = findViewById(R.id.view) as SlidingSquareLoaderView

        findViewById(R.id.button1).setOnClickListener {
            view.show()
        }

        findViewById(R.id.button2).setOnClickListener {
            view.hide()
        }*/
    }
}