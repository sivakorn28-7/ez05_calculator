package com.example.ez_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {

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

        var currentNumber = ""
        var Number1 = ""
        var Number2 = ""
        var currentOperand = ""


        Btclear.setOnClickListener {
            currentNumber = ""
            Tans.setText("0")
            currentOperand = ""

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
//            currentNumber = ""
//            Tans.text = "0"
        }

        Btminus.setOnClickListener {
            currentOperand = "-"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
        }

        Btmulti.setOnClickListener {
            currentOperand = "*"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
        }

        Btdivide.setOnClickListener {
            currentOperand = "/"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber
        }

        Btmod.setOnClickListener {
            currentOperand = "%"
            Number1 = currentNumber
            currentNumber = "0"
            Tans.text = currentNumber

        }

        Btequal.setOnClickListener {
            Number2 = currentNumber
            var result = 0.0

                when (currentOperand) {
                    "+" -> result = Number1.toDouble()   + Number2.toDouble()
                    "-" -> result = Number1.toDouble() - Number2.toDouble()
                    "*" -> result = Number1.toDouble() * Number2.toDouble()
                    "/" -> {
                        if (Number2.toDouble() == 0.0) {
                            Tans.text = "Error: Division by zero"
                        } else {
                            result = Number1.toDouble() / Number2.toDouble()
                        }
                    }
                    "%" -> result =  Number1.toDouble() % Number2.toDouble()
                }
                Tans.text = result.toString() // Display the result

        }

        Bt0.setOnClickListener {
            //currentNumber = Tans.text.toString()
            if (currentNumber == "0") {
                currentNumber = "0"
                Tans.setText("0")
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
                Tans.setText("1")
            }else{
                currentNumber += "1"
                Tans.text = currentNumber
            }

        }

        Bt2.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "2"
                Tans.setText("2")
            }else{
                currentNumber += "2"
                Tans.text = currentNumber
            }
        }

        Bt3.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "3"
                Tans.setText("3")
            }else{
                currentNumber += "3"
                Tans.text = currentNumber
            }
        }

        Bt4.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "4"
                Tans.setText("4")
            }else{
                currentNumber += "4"
                Tans.text = currentNumber
            }
        }

        Bt5.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "5"
                Tans.setText("5")
            }else{
                currentNumber += "5"
                Tans.text = currentNumber
            }
        }

        Bt6.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "6"
                Tans.setText("6")
            }else{
                currentNumber += "6"
                Tans.text = currentNumber
            }
        }

        Bt7.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "7"
                Tans.setText("7")
            }else{
                currentNumber += "7"
                Tans.text = currentNumber
            }
        }

        Bt8.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "8"
                Tans.setText("8")
            }else{
                currentNumber += "8"
                Tans.text = currentNumber
            }
        }

        Bt9.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "9"
                Tans.setText("9")
            }else{
                currentNumber += "9"
                Tans.text = currentNumber
            }
        }
    }
}

//package com.example.calculator
//
//import android.os.Bundle
//import android.util.Log
//import android.view.View
//import android.widget.Button
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var resultTextView: TextView
//    private var currentInput: String = ""
//    private var currentOperator: String? = ""
//    private var firstOperand: Double? = 0.0
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        resultTextView = findViewById(R.id.textView)
//
//        // เพิ่ม OnClickListener ให้กับปุ่มทุกปุ่มตัวเลข
//        val numberButtons = arrayOf(
//            R.id.button5, R.id.button6, R.id.button7, R.id.button9,
//            R.id.button10, R.id.button11, R.id.button13, R.id.button14,
//            R.id.button15, R.id.button17
//        )
//
//        for (buttonId in numberButtons) {
//            findViewById<Button>(buttonId).setOnClickListener {
//                onNumberButtonClick(it)
//            }
//        }
//
//        // เพิ่ม OnClickListener ให้กับปุ่มลบ
//        findViewById<Button>(R.id.button2).setOnClickListener {
//            onDeleteButtonClick()
//        }
//
//        // เพิ่ม OnClickListener ให้กับปุ่มลบทั้งหมด
//        findViewById<Button>(R.id.button1).setOnClickListener {
//            clearAll()
//        }
//
//
//        // เพิ่ม OnClickListener ให้กับปุ่มเพิ่ม, ลบ, คูณ, หาร, modulo
//        val operatorButtons = arrayOf(
//            R.id.button16, R.id.button12, R.id.button8,R.id.button4, R.id.button3
//        )
//
//        for (buttonId in operatorButtons) {
//            findViewById<Button>(buttonId).setOnClickListener {
//                onOperatorButtonClick(it)
//            }
//        }
//
//        // เพิ่ม OnClickListener ให้กับปุ่มเท่ากับ
//        findViewById<Button>(R.id.button19).setOnClickListener {
//            onEqualsButtonClick()
//        }
//
//    }
//
//    private fun clearAll() {
//        currentInput = "0"
//        currentOperator = null
//        firstOperand = null
//        updateResult()
//    }
//
//
//    private fun onNumberButtonClick(view: View) {
//        val buttonText = (view as Button).text.toString()
//
//        if (currentInput == "0") {
//            // กรณีที่เป็นเลข 0 เลขเดียวบนหน้าจอ ไม่เพิ่มจำนวนเลข 0
//            currentInput = buttonText
//        } else {
//            currentInput += buttonText
//        }
//
//        updateResult()
//    }
//
//    private fun onDeleteButtonClick() {
//        if (currentInput.length > 1) {
//            // ลบตัวเลขที่พิมพ์ล่าสุดทีละ 1 หลัก
//            currentInput = currentInput.substring(0, currentInput.length - 1)
//        } else {
//            // หากเหลือเลขหลักเดียว กดลบซ้ำเป็นเลข 0
//            currentInput = "0"
//        }
//
//        updateResult()
//    }
//
//    private fun onOperatorButtonClick(view: View) {
//        currentOperator = (view as Button).text.toString()
//        firstOperand = currentInput.toDouble()
//        currentInput = "0"
//    }
//
//    private fun onEqualsButtonClick() {
//        if (currentOperator != null && firstOperand != null) {
//            val secondOperand = currentInput.toDouble()
//            val result = when (currentOperator) {
//                "+" -> firstOperand!! + secondOperand
//                "-" -> firstOperand!! - secondOperand
//                "x" -> firstOperand!! * secondOperand
//                "/" -> firstOperand!! / secondOperand
//                "%" -> firstOperand!! % secondOperand
//                else -> throw IllegalArgumentException("Invalid operator")
//            }
//
//            currentInput = result.toString()
//            currentOperator = null
//            firstOperand = null
//
//            updateResult()
//        }
//    }
//
//
//
//    private fun updateResult() {
//        resultTextView.text = currentInput
//    }
//}