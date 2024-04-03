package com.ubayadef.week6_160421034.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubayadef.week6_160421034.R
import com.ubayadef.week6_160421034.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}