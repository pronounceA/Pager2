package com.example.pager2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalButton.setOnClickListener { onButtonTapped(it) }
        binding.verticalButton.setOnClickListener { onButtonTapped(it) }
        binding.tapButton.setOnClickListener { onButtonTapped(it) }
    }

    fun onButtonTapped(view: View?) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }




}