package com.udemy.android.sarath.firstapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculateFuel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_fuel)
        val totalDist = findViewById<EditText>(R.id.fc_total_dist_input)
        val mileage = findViewById<EditText>(R.id.fc_mileage_input)
        val costPerLitreInput = findViewById<EditText>(R.id.fc_per_lit_cost_input)
        val calculateBtn = findViewById<Button>(R.id.fc_calculate_fuel_button)
        val finalDisplayTextMileage = findViewById<TextView>(R.id.fc_final_fuel_text)

        calculateBtn.setOnClickListener {
            val enteredDist = totalDist.text.toString().toFloat()
            val enteredMileage = mileage.text.toString().toFloat()
            val enteredCost = costPerLitreInput.text.toString().toFloat()
            val costPerKm = enteredCost / enteredMileage
            val fuelCost = enteredDist*costPerKm
            closeKeyBoard()
            finalDisplayTextMileage.text = "Rupees: $fuelCost"
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