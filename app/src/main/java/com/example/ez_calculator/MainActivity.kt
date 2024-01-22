package com.example.ez_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Bt0: Button = findViewById(R.id.Bt0)
        val Bt1: Button = findViewById(R.id.Bt1)
        val Bt2: Button = findViewById(R.id.Bt2)
        val Bt3: Button = findViewById(R.id.Bt3)
        val Bt4: Button = findViewById(R.id.Bt4)
        val Bt5: Button = findViewById(R.id.Bt5)
        val Bt6: Button = findViewById(R.id.Bt6)
        val Bt7: Button = findViewById(R.id.Bt7)
        val Bt8: Button = findViewById(R.id.Bt8)
        val Bt9: Button = findViewById(R.id.Bt9)
        val Btdot: Button = findViewById(R.id.Btdot)

        val Btclear: Button = findViewById(R.id.Btclear)
        val Btdel: Button = findViewById(R.id.Btdel)
        val Btmod: Button = findViewById(R.id.Btmod)
        val Btdivide: Button = findViewById(R.id.Btdivide)
        val Btmulti: Button = findViewById(R.id.Btmulti)
        val Btminus: Button = findViewById(R.id.Btminus)
        val Btplus: Button = findViewById(R.id.Btplus)
        val Btequal: Button = findViewById(R.id.Btequal)

        val Tans: TextView = findViewById(R.id.Tans)

        var currentNumber = "0"
        var Number1 = ""
        var Number2 = ""
        var currentOperand = ""
        var dot:Boolean = false


        Btclear.setOnClickListener {
            currentNumber = "0"
            Tans.text = currentNumber
            currentOperand = ""
            dot = false

        }

        Btdel.setOnClickListener {
//            if (currentNumber.isNotEmpty()) {
//                // Remove the last character from the currentNumber
//                currentNumber = currentNumber.substring(0, currentNumber.length - 1)
//                Tans.text = currentNumber
//                // If currentNumber is empty after deletion, set it to "0"
//                if (currentNumber.isEmpty()) {
//                    currentNumber = ""
//                    Tans.setText("0")
//                }
//            }
            if (currentNumber.isNotEmpty()) {

                currentNumber = currentNumber.substring(0, currentNumber.length - 1)
                Tans.text = currentNumber

                if (currentNumber.isEmpty()) {
                    currentNumber = "0"
                    Tans.text = currentNumber
                }
            }
        }

        Btplus.setOnClickListener {
            currentOperand = "+"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
            dot = false
//            currentNumber = ""
//            Tans.text = "0"
        }

        Btminus.setOnClickListener {
            currentOperand = "-"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
            dot = false
        }

        Btmulti.setOnClickListener {
            currentOperand = "*"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
            dot = false
        }

        Btdivide.setOnClickListener {
            currentOperand = "/"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
            dot = false
        }

        Btmod.setOnClickListener {
            currentOperand = "%"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
            dot = false
        }

        Btequal.setOnClickListener {
            Number2 = currentNumber
            var result = 0.0

                when (currentOperand) {
                    "+" -> result = Number1.toDouble() + Number2.toDouble()
                    "-" -> result = Number1.toDouble() - Number2.toDouble()
                    "*" -> result = Number1.toDouble() * Number2.toDouble()
                    "/" -> result = Number1.toDouble() / Number2.toDouble()
                    "%" -> result =  Number1.toDouble() % Number2.toDouble()
                }

                if(result.toString() == "Infinity" ) {
                    Tans.text = "Error: Division by zero"
                }else {
                    Tans.text = result.toString() // Display the result
                }
            Number1 = result.toString()
            currentNumber = result.toString()
        }

        Bt0.setOnClickListener {
            //currentNumber = Tans.text.toString()
            if (currentNumber == "0") {
                currentNumber = "0"
                Tans.text = "0"
            } else {
                currentNumber += "0"
                Tans.text = currentNumber
            }
//            if (currentNumber == "") {
//                currentNumber == ""
//            } else {
//                currentNumber += "0"
//                Tans.text = currentNumber
//            }

        }

        Bt1.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "1"
                Tans.text = "1"
            }else{
                currentNumber += "1"
                Tans.text = currentNumber
            }

        }

        Bt2.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "2"
                Tans.text = "2"
            }else{
                currentNumber += "2"
                Tans.text = currentNumber
            }
        }

        Bt3.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "3"
                Tans.text = "3"
            }else{
                currentNumber += "3"
                Tans.text = currentNumber
            }
        }

        Bt4.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "4"
                Tans.text = "4"
            }else{
                currentNumber += "4"
                Tans.text = currentNumber
            }
        }

        Bt5.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "5"
                Tans.text = "5"
            }else{
                currentNumber += "5"
                Tans.text = currentNumber
            }
        }

        Bt6.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "6"
                Tans.text = "6"
            }else{
                currentNumber += "6"
                Tans.text = currentNumber
            }
        }

        Bt7.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "7"
                Tans.text = "7"
            }else{
                currentNumber += "7"
                Tans.text = currentNumber
            }
        }

        Bt8.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "8"
                Tans.text = "8"
            }else{
                currentNumber += "8"
                Tans.text = currentNumber
            }
        }

        Bt9.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "9"
                Tans.text = "9"
            }else{
                currentNumber += "9"
                Tans.text = currentNumber
            }
        }

        Btdot.setOnClickListener {
            if (dot == false) {
                currentNumber += "."
                Tans.text = currentNumber
                dot = true
            }
        }
    }
}

