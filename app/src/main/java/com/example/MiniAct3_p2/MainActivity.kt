package com.example.MiniAct3_p2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView : TextView = findViewById(R.id.mainText)



        if (intent.hasExtra(Intent.EXTRA_TEXT)){
            textView.text=intent.getStringExtra(Intent.EXTRA_TEXT)
        }

        val goSecAct : Button = findViewById(R.id.GoSecAct)
        goSecAct.setOnClickListener(){
            val goTo2ndActIntent = Intent(this,SecondActivity::class.java)
            startActivity(goTo2ndActIntent)
        }

    }
}