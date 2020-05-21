package com.example.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.tile_one)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.tile_two)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.tile_three)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.tile_four)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.tile_five)
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundResource(R.drawable.tile_six)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstrantLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText, rootConstrantLayout,
                    redButton, greenButton, yellowButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it)}
        }
    }
}
