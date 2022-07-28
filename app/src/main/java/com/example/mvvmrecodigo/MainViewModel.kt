package com.example.mvvmrecodigo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

class MainViewModel: ViewModel() {
    val luckyNumber:MutableLiveData<String> = MutableLiveData()

            fun onBtnRollPressed(){
                //genera numero random 0-1
                val randomNumber= Math.random()
                val randomNumberFrom0to100=(randomNumber*100).roundToInt()
                luckyNumber.value=randomNumberFrom0to100.toString()
            }




}