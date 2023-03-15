package com.ismailaksu.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    fun mySum(view : View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"

        } else {
            result = number1!! + number2!!
            resultText.text = "Result : $result"
        }
    }
    fun mySub(view : View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"

        } else {
            result = number1!! - number2!!
            resultText.text = "Result : $result"
        }
    }
    fun myDiv(view : View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"

        } else {
            result = number1!! / number2!!
            resultText.text = "Result : $result"
        }
    }
    fun myMultiply(view : View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"

        } else {
            result = number1!! * number2!!
            resultText.text = "Result : $result"
        }
    }
}