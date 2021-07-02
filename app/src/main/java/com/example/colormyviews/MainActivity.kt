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

        binding.pietButton.setOnClickListener(){
            drawPiet()
        }

    }

    private fun drawPiet(){


        binding.yellowBoxOne.setBackgroundResource(R.color.piet_yellow)
        binding.blackBoxOne.setBackgroundResource(R.color.piet_black)

        binding.blueBoxOne.setBackgroundResource(R.color.piet_blue)
        binding.redBoxOne.setBackgroundResource(R.color.piet_red)
        binding.redBoxTwo.setBackgroundResource(R.color.piet_red)
        binding.yellowBoxTwo.setBackgroundResource(R.color.piet_yellow)

        binding.yellowBoxThree.setBackgroundResource(R.color.piet_yellow)
        binding.blueBoxThree.setBackgroundResource(R.color.piet_blue)
        binding.blueBoxTwo.setBackgroundResource(R.color.piet_blue)
        binding.redBoxThree.setBackgroundResource(R.color.piet_red)
        binding.yellowBoxFour.setBackgroundResource(R.color.piet_yellow)
        binding.blackBoxTwo.setBackgroundResource(R.color.piet_black)
        binding.redBoxFour.setBackgroundResource(R.color.piet_red)
        binding.yellowBoxSix.setBackgroundResource(R.color.piet_yellow)

        binding.blueBoxFour.setBackgroundResource(R.color.piet_blue)

        binding.blackBoxThree.setBackgroundResource(R.color.piet_black)
        binding.blackBoxFour.setBackgroundResource(R.color.piet_black)
        binding.redBoxFive.setBackgroundResource(R.color.piet_red)

        binding.whiteBoxOne.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxTwo.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxThree.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxFour.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxFive.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxSix.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxSeven.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxEight.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxNine.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxTen.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxEleven.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxTwelve.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxThirteen.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxFourteen.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxFifteen.setBackgroundResource(R.color.piet_white)
        binding.whiteBoxSixteen.setBackgroundResource(R.color.piet_white)


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
            binding.pietButton,

            binding.whiteBoxOne, binding.whiteBoxTwo, binding.whiteBoxThree, binding.whiteBoxFour, binding.whiteBoxFive,
            binding.whiteBoxSix, binding.whiteBoxSeven, binding.whiteBoxEight, binding.whiteBoxNine, binding.whiteBoxTen,
            binding.whiteBoxEleven, binding.whiteBoxTwelve, binding.whiteBoxThirteen, binding.whiteBoxFourteen,
            binding.whiteBoxFifteen, binding.whiteBoxSixteen)

        for (item in clickableViews){
            item.setOnClickListener(){
                makeColored(item) //or "it" keyword instead of variable item, works both ways (or binding.yellowBoxOne)
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






                    binding.whiteBoxOne.id -> view.setBackgroundResource(R.color.piet_black)
                    binding.whiteBoxTwo.id -> view.setBackgroundResource(R.color.piet_blue)
                    binding.whiteBoxThree.id -> view.setBackgroundResource(R.color.piet_red)
                    binding.whiteBoxFour.id -> view.setBackgroundResource(R.color.piet_blue)
                    binding.whiteBoxFive.id -> view.setBackgroundResource(R.color.piet_yellow)
                    binding.whiteBoxSix.id -> view.setBackgroundResource(R.color.piet_black)
                    binding.whiteBoxSeven.id -> view.setBackgroundResource(R.color.piet_yellow)
                    binding.whiteBoxEight.id -> view.setBackgroundResource(R.color.piet_red)
                    binding.whiteBoxNine.id -> view.setBackgroundResource(R.color.piet_blue)
                    binding.whiteBoxTen.id -> view.setBackgroundResource(R.color.piet_red)
                    binding.whiteBoxEleven.id -> view.setBackgroundResource(R.color.piet_red)
                    binding.whiteBoxTwelve.id -> view.setBackgroundResource(R.color.piet_yellow)
                    binding.whiteBoxThirteen.id -> view.setBackgroundResource(R.color.piet_blue)
                    binding.whiteBoxFourteen.id -> view.setBackgroundResource(R.color.piet_black)
                    binding.whiteBoxFifteen.id -> view.setBackgroundResource(R.color.piet_blue)
                    binding.whiteBoxSixteen.id -> view.setBackgroundResource(R.color.piet_yellow)



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