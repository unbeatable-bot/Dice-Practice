package com.example.dicepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButon : Button = findViewById(R.id.button)
        rollButon.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomNumber = (1..6).random()

        val drawbleResource = when(randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val diceImage : ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(drawbleResource)
    }
}