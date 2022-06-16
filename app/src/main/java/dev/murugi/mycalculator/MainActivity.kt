package dev.murugi.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1: TextInputLayout
    lateinit var tilNum2: TextInputLayout
    lateinit var etNum1: TextInputEditText
    lateinit var etNum2: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilNum1 = findViewById(R.id.tilNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvResult = findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {
            tvResult.text = ""
            var numb1 = etNum1.text.toString()
            var numb2 = etNum2.text.toString()

            if (numb1.isBlank()){
                tilNum1.error = "First number is required"
                return@setOnClickListener
            }
            if (numb2.isBlank()){
                tilNum2.error = "Second number is required"
                return@setOnClickListener
            }
            addition(numb1.toDouble(),numb2.toDouble())
        }
        btnSubtract.setOnClickListener {
            tvResult.text = ""
            var numb1 = etNum1.text.toString()
            var numb2 = etNum2.text.toString()

            if (numb1.isBlank()){
                tilNum1.error = "First number is required"
                return@setOnClickListener
            }
            if (numb2.isBlank()){
                tilNum2.error = "Second number is required"
                return@setOnClickListener
            }
            subtraction(numb1.toDouble(),numb2.toDouble())
        }
        btnModulus.setOnClickListener {
            tvResult.text = ""
            var numb1 = etNum1.text.toString()
            var numb2 = etNum2.text.toString()

            if (numb1.isBlank()){
                tilNum1.error = "First number is required"
                return@setOnClickListener
            }
            if (numb2.isBlank()){
                tilNum2.error = "Second number is required"
                return@setOnClickListener
            }
            modulus(numb1.toDouble(),numb2.toDouble())
        }
        btnDivision.setOnClickListener {
            tvResult.text = ""
            var numb1 = etNum1.text.toString()
            var numb2 = etNum2.text.toString()

            if (numb1.isBlank()){
                tilNum1.error = "First number is required"
                return@setOnClickListener
            }
            if (numb2.isBlank()){
                tilNum2.error = "Second number is required"
                return@setOnClickListener
            }
            division(numb1.toDouble(),numb2.toDouble())
        }
    }
    fun addition(num1:Double,num2:Double){
        val result = num1 + num2
        tvResult.text = result.toString()
    }
    fun subtraction(num1:Double,num2:Double){
        val result = num1 - num2
        tvResult.text = result.toString()
    }
    fun modulus(num1:Double,num2:Double){
        val result = num1 % num2
        tvResult.text = result.toString()
    }
    fun division(num1:Double,num2:Double){
        val result = num1 / num2
        tvResult.text = result.toString()
    }
}