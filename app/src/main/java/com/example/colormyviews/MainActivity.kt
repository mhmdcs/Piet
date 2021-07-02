package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //these three lines of code below are essential for inflating the activity_main xml file through binding object
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListeners()
    }

    private fun setListeners(){

//        binding.boxOneText.setOnClickListener(){
//            makeColored(binding.boxOneText)
//        }
//
//        binding.boxTwoText.setOnClickListener(){
//            makeColored(binding.boxTwoText)
//        }
        //instead of doing the above, you can define a linked list and create a for loop to fill them in shorter lines

        val clickableViews: List<View> = listOf(binding.boxOneText, binding.boxTwoText, binding.boxThreeText,
        binding.boxFourText, binding.boxFiveText)

        for (item in clickableViews){
            item.setOnClickListener(){
                makeColored(item) //or "it" keyword instead of variable item, works both ways
            }
        }

    }

    private fun makeColored(view: View){

        //        if(view.id == R.id.box_one_text)
        //        view.setBackgroundColor(Color.DKGRAY)
        //        else
        //            view.setBackgroundColor(Color.GRAY)
        //
        //rather than doing long if else statements, do a simple when loop

        when(view.id){

            //boxes using Color class for the background colors
            binding.boxOneText.id -> view.setBackgroundColor(Color.DKGRAY) // binding.boxOneText.id and R.id.box_one_text work same
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY) // binding.boxTwoText.id and R.id.box_two_text work same

            //boxes using Android colors resources for the background colors
            binding.boxThreeText.id -> view.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFourText.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
            binding.boxFiveText.id -> view.setBackgroundResource(android.R.color.holo_green_light)

                else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }


}