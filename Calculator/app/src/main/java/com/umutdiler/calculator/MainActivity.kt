package com.umutdiler.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.umutdiler.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)}



        fun myPlus(view: View)
        {
            var number1  = binding.number1Text.text.toString().toDoubleOrNull()
            var number2  = binding.number2Text.text.toString().toDoubleOrNull()
            if(number1 == null || number2 == null)
            {
                binding.textResult.text = "Enter Number"
            }
            else
            {
                binding.textResult.text = (number1+number2).toString()
            }
        }
        fun mySubtract(view: View)
        {
            var number1  = binding.number1Text.text.toString().toDoubleOrNull()
            var number2  = binding.number2Text.text.toString().toDoubleOrNull()
            if(number1 == null || number2 == null)
            {
                binding.textResult.text = "Enter Number"
            }
            else
            {
                binding.textResult.text = (number1-number2).toString()
            }
        }
        fun myMultiply(view: View)
        {
            var number1  = binding.number1Text.text.toString().toDoubleOrNull()
            var number2  = binding.number2Text.text.toString().toDoubleOrNull()
            if(number1 == null || number2 == null)
            {
                binding.textResult.text = "Enter Number"
            }
            else
            {
                binding.textResult.text = (number1*number2).toString()
            }
        }
        fun myDivision(view:View)
        {
            var number1  = binding.number1Text.text.toString().toDoubleOrNull()
            var number2  = binding.number2Text.text.toString().toDoubleOrNull()
            if(number1 == null || number2 == null)
            {
                binding.textResult.text = "Enter Number"
            }
            else
            {
                binding.textResult.text = (number1/number2).toString()
            }
        }




    }
