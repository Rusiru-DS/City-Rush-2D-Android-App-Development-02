package com.example.gameapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        //get the component with id - go to PLAY
        val buttonPlay = findViewById<Button>(R.id.btnPlay)

        buttonPlay.setOnClickListener{
            val nextPage = Intent(this, GameSelect::class.java);
            startActivity(nextPage);
            finish();
        }

        //get the component with id - go to options
        val buttonOptions = findViewById<Button>(R.id.btnOption)

        buttonOptions.setOnClickListener{
            val nextPage = Intent(this, OptionsScreen::class.java);
            startActivity(nextPage);
            finish();
        }

        //get the component with id - go to HOW TO PLAY
        val buttonHow2Play = findViewById<Button>(R.id.btnH2Play)

        buttonHow2Play.setOnClickListener{
            val nextPage = Intent(this, HowtoPlay::class.java);
            startActivity(nextPage);
            finish();
        }

        //get the component with id - go to EXIT
        val buttonExit = findViewById<Button>(R.id.btnExit)

        buttonExit.setOnClickListener{
            val nextPage = Intent(this, StartupscreenActivity::class.java);
            startActivity(nextPage);
            finish();
        }
    }
}