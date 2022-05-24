package com.udemy.android.sarath.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val milCalTv = findViewById<TextView>(R.id.mc_tv)
        val fuelBtn = findViewById<Button>(R.id.furl_btn)
        val mileageBtn = findViewById<Button>(R.id.mileage_btn)

        mileageBtn.setOnClickListener{
           val intent = Intent(this, CalculateMileage::class.java)
            startActivity(intent)
        }

        fuelBtn.setOnClickListener {
            val intent1 = Intent(this,CalculateFuel::class.java)
            startActivity(intent1)
        }
    }




}