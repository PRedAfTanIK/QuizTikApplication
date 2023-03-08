package com.example.quiztik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButt: Button = findViewById(R.id.startButt)
        val editText : EditText = findViewById(R.id.ET_name)
        startButt.setOnClickListener {

            if(editText.text.isEmpty()){
                Toast.makeText(this,"Name can't be empty",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, editText.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}