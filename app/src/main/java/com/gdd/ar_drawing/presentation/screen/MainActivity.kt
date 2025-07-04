package com.gdd.ar_drawing.presentation.screen

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.gdd.ar_drawing.databinding.ActivityMainBinding
import com.gdd.ar_drawing.utils.LanguageUtil

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.e("MainActivity", "onCreate called")
    }

    override fun onSupportNavigateUp(): Boolean {
        navController = binding.navHostFragment.findNavController()
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}