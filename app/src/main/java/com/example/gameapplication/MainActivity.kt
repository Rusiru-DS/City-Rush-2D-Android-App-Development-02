package com.example.gameapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(), GameTask {
    lateinit var rootLayout : LinearLayout
    lateinit var startBtn :Button
    lateinit var btnMapSelect : Button
    lateinit var btnRestart : Button
    lateinit var mGameView: GameView
    lateinit var score: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startBtn = findViewById(R.id.startBtn)
        btnRestart = findViewById(R.id.btnRestart)
        btnMapSelect = findViewById(R.id.btnMapSelect)
        rootLayout = findViewById(R.id.rootLayout)
        score = findViewById(R.id.score)
        mGameView = GameView(this, this)

        startBtn.setOnClickListener{
            mGameView.setBackgroundResource(R.drawable.road1)
            rootLayout.addView(mGameView)
            startBtn.visibility = View.GONE
            score.visibility = View.GONE

        }

        //get the component with id - go to PLAY
        val buttonRestart = findViewById<Button>(R.id.btnRestart)

        buttonRestart.setOnClickListener{
            val nextPage = Intent(this, MainActivity::class.java);
            startActivity(nextPage);
            finish();
        }



        //get the component with id - go to PLAY
        val buttonBack = findViewById<Button>(R.id.btnMapSelect)

        buttonBack.setOnClickListener{
            val nextPage = Intent(this, GameSelect::class.java);
            startActivity(nextPage);
            finish();
        }
    }

    override fun closeGame(mScore: Int) {
        score.text = "Score : $mScore"
        rootLayout.removeView(mGameView)
        startBtn.visibility = View.VISIBLE
        score.visibility = View.VISIBLE
        btnRestart.visibility = View.VISIBLE
        btnMapSelect.visibility = View.VISIBLE
    }
}