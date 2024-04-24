package com.example.multiplyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.multiplyapp.R


class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button2: Button
    lateinit var display: TextView
    lateinit var textField: EditText
    var number: Int = 0
    var enteredNumber: Int = 0
    var digits = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var answer: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button = findViewById(R.id.press)
        button2 = findViewById(R.id.redo)
        display = findViewById(R.id.view)
        textField = findViewById(R.id.enter)

        display.text = "Please enter a number"

        button.setOnClickListener {
            enteredNumber = textField.text.toString().toInt()

            for (num in digits) {
                number = enteredNumber * num
                answer += "${number},"
            }


            display.text = answer
        }

        button2.setOnClickListener {
            textField.text.clear()
            answer = ""
            number = 0
            display.text = "Enter Number"
        }


    }
}


