package com.example.gameapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class GameSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_select)

        //get back to home
        val btnhome = findViewById<Button>(R.id.btnhome1)

        btnhome.setOnClickListener{
            val nextPage = Intent(this, HomePage::class.java);
            startActivity(nextPage);
            finish();
        }

        //SELECT MAP - Map 1
        val buttonMap1 = findViewById<ImageButton>(R.id.btnmap1)

        buttonMap1.setOnClickListener{
            val nextPage = Intent(this, MainActivity::class.java);
            startActivity(nextPage);
            finish();
        }

        //SELECT MAP - map - 2
        val buttonMap2 = findViewById<ImageButton>(R.id.btnmap2)

        buttonMap2.setOnClickListener{
            val nextPage = Intent(this, MainActivity::class.java);
            startActivity(nextPage);
            finish();
        }

        //SELECT MAP - Map 3
        val buttonMap3 = findViewById<ImageButton>(R.id.btnmap3)

        buttonMap3.setOnClickListener{
            val nextPage = Intent(this, MainActivity::class.java);
            startActivity(nextPage);
            finish();
        }
    }
}