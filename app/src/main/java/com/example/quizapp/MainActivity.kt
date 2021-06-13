package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_main)

        // To hide the status bar.


        btn_flagi.setOnClickListener {

            val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)

            startActivity(intent)


        }

        btn_Zwierzeta.setOnClickListener {

            val intent2 = Intent(this@MainActivity, Zwierzeta::class.java)

            startActivity(intent2)


        }

        btn_auta.setOnClickListener {

            val intent3 = Intent(this@MainActivity, auta::class.java)

            startActivity(intent3)


        }

        btn_Loga.setOnClickListener {

            val intent4 = Intent(this@MainActivity, Loga::class.java)

            startActivity(intent4)


        }
    }
}