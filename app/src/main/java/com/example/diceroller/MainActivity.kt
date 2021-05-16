package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
       // rollButton.text = "Let's roll the Dice"
        rollButton.setOnClickListener {
            rollDice()


        }
    }

    private fun rollDice() {

       var random= Random().nextInt(6)+1
        val imageResource = when (random){
            1 ->R.drawable.dice_1
            2 ->R.drawable.dice_2
            3 ->R.drawable.dice_3
            4 ->R.drawable.dice_4
            5->R.drawable.dice_6
            else ->R.drawable.dice_6
        }
       val diceImage : ImageView =findViewById(R.id.dice_image)
        diceImage.setImageResource(imageResource)
    }

}