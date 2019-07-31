package com.example.conditionalchallenge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var rnum = randomNumber()

         val num = findViewById<EditText>(R.id.guess)
         val check = findViewById<Button>(R.id.submit)

    check.setOnClickListener{

        val enteredNum = num.text.toString()
        if (rnum > Integer.parseInt(enteredNum)){
            Toast.makeText(applicationContext, "Too low try again!", Toast.LENGTH_SHORT).show()

        } else if (rnum < Integer.parseInt(enteredNum)) {
            Toast.makeText(applicationContext, "Too high try again!", Toast.LENGTH_SHORT).show()


        } else {
            Toast.makeText(applicationContext, "Good Job", Toast.LENGTH_SHORT).show()
            rnum = randomNumber()
        }
    }
    }

    fun randomNumber(): Int {
        return Random.nextInt(27)
    }
}
