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

        val clickableViews: List<View> = listOf(binding.yellowBoxOne, binding.blackBoxOne, binding.blueBoxOne,
            binding.redBoxOne, binding.redBoxTwo, binding.yellowBoxTwo, binding.yellowBoxThree, binding.blueBoxThree,
            binding.blueBoxTwo, binding.redBoxThree, binding.yellowBoxFour, binding.blackBoxTwo, binding.redBoxFour,
            binding.yellowBoxSix, binding.blueBoxFour, binding.blackBoxThree, binding.blackBoxFour, binding.redBoxFive,
            binding.pietButton)

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

            binding.yellowBoxOne.id -> view.setBackgroundResource(R.color.piet_yellow) // binding.boxOneText.id and R.id.box_one_text work same
            R.id.black_box_one -> view.setBackgroundResource(R.color.piet_black) // binding.boxTwoText.id and R.id.box_two_text work same

            binding.blueBoxOne.id -> view.setBackgroundResource(R.color.piet_blue)
            binding.redBoxOne.id -> view.setBackgroundResource(R.color.piet_red)
            binding.redBoxTwo.id -> view.setBackgroundResource(R.color.piet_red)
            binding.yellowBoxTwo.id -> view.setBackgroundResource(R.color.piet_yellow)

            binding.yellowBoxThree.id -> view.setBackgroundResource(R.color.piet_yellow)
            binding.blueBoxThree.id -> view.setBackgroundResource(R.color.piet_blue)
            binding.blueBoxTwo.id -> view.setBackgroundResource(R.color.piet_blue)
            binding.redBoxThree.id -> view.setBackgroundResource(R.color.piet_red)
            binding.yellowBoxFour.id -> view.setBackgroundResource(R.color.piet_yellow)
            binding.blackBoxTwo.id -> view.setBackgroundResource(R.color.piet_black)
            binding.redBoxFour.id -> view.setBackgroundResource(R.color.piet_red)
            binding.yellowBoxSix.id -> view.setBackgroundResource(R.color.piet_yellow)


            binding.blueBoxFour.id -> view.setBackgroundResource(R.color.piet_blue)


            binding.blackBoxThree.id -> view.setBackgroundResource(R.color.piet_black)
            binding.blackBoxFour.id -> view.setBackgroundResource(R.color.piet_black)
            binding.redBoxFive.id -> view.setBackgroundResource(R.color.piet_red)



//            //boxes using Android colors resources for the background colors
//            binding.boxThreeText.id -> view.setBackgroundResource(android.R.color.holo_green_light)
//            binding.boxFourText.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
//            binding.boxFiveText.id -> view.setBackgroundResource(android.R.color.holo_green_light)
//
//            binding.redButton.id -> binding.boxThreeText.setBackgroundResource(R.color.my_red)
//            binding.yellowButton.id -> binding.boxFourText.setBackgroundResource(R.color.my_yellow)
//            binding.greenButton.id -> binding.boxFiveText.setBackgroundResource(R.color.my_green)

          //  else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }



}