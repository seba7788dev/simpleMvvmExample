package com.example.mvvmrecodigo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmrecodigo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        //delegamos la tarea de crear el viewModel a Android con el Provider
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btnRoll.setOnClickListener {
            viewModel.onBtnRollPressed()
        }

        //actualizamos el textView con el numero de la suerte
        viewModel.luckyNumber.observe(this, Observer { lucky->
            binding.tvTitle.text= lucky
        })
    }
}