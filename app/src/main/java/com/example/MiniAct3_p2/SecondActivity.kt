package com.example.MiniAct3_p2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val res = intent.data
        val textView : TextView = findViewById(R.id.UrlText)
        if(res==null){
            textView.text= "No url inserted"
        }else{
            textView.text= res.toString()
        }


        val goBackButton : Button = findViewById(R.id.GoBackButton)
        goBackButton.setOnClickListener(){
            val goToMain = Intent(this,MainActivity::class.java)
            startActivity(goToMain)
        }
    }

}