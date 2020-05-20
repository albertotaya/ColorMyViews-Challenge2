package com.example.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText, rootConstrantLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it)}
        }
    }
}
