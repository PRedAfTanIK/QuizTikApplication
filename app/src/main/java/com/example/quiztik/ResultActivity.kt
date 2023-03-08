package com.example.quiztik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvView: TextView = findViewById(R.id.tv_username)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val finishButt: Button = findViewById(R.id.finish_butt)

        tvView.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore.text = "Your Score is:" +
                "${intent.getIntExtra(Constants.CORRECT_ANSWERS,0)}/" +
                "${intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)}"

        finishButt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}