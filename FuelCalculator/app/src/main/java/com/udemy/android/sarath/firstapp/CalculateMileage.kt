package com.udemy.android.sarath.firstapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round

class CalculateMileage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_mileage)

        val amountInput = findViewById<EditText>(R.id.amount_input)
        val distanceInput = findViewById<EditText>(R.id.distance_input)
        val costPerLitreInput = findViewById<EditText>(R.id.per_lit_cost_input)
        val calculateBtn = findViewById<Button>(R.id.calculate_mileage_button)
        val finalDisplayTextMileage = findViewById<TextView>(R.id.final_mileage_text)

        calculateBtn.setOnClickListener {

            val enteredAmountStr = amountInput.text.toString().toFloat()
            val enteredDistanceStr = distanceInput.text.toString().toFloat()
            val enteredCostPerLitreStr = costPerLitreInput.text.toString().toFloat()
            val litersPut = enteredAmountStr / enteredCostPerLitreStr
            val mileage = enteredDistanceStr / litersPut
            closeKeyBoard()
            finalDisplayTextMileage.text = "The milege is: $mileage"
        }

    }
    private fun closeKeyBoard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

}


