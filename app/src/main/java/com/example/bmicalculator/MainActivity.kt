package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightValue = findViewById<EditText>(R.id.etHeight)
        val weightValue = findViewById<EditText>(R.id.etWeight)

        val calcButton = findViewById<Button>(R.id.btnCalculate)

        calcButton.setOnClickListener{
            val weight = weightValue.text.toString()
            val height = heightValue.text.toString()

            val bmi = weight.toFloat()/((height.toFloat()/100)*(height.toFloat()/100))

            val bmiTrimmed = String.format("%.2f",bmi).toFloat()
            outputResult(bmiTrimmed)
        }
    }
    private fun outputResult(bmi:Float){
        val resultIndex = findViewById<TextView>(R.id.tvIndex)
        val resultDescription = findViewById<TextView>(R.id.tvStatement)
        val info = findViewById<TextView>(R.id.tvInfo)

        resultIndex.text = bmi.toString()
        info.text = "Normal BMI range is 18.5 - 24.9"


    }

}