package com.example.gameapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OptionsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_screen)

        //get back to home page
        val buttonB2Home = findViewById<Button>(R.id.buttonhome)

        buttonB2Home.setOnClickListener{
            val nextPage = Intent(this, HomePage::class.java);
            startActivity(nextPage);
            finish();
        }
    }
}