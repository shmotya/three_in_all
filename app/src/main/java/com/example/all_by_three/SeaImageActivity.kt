package com.example.all_by_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_by_three.databinding.ActivityMainBinding
import com.example.all_by_three.databinding.ActivitySeaImageBinding

class SeaImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeaImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeaImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibBackSeaImages.setOnClickListener {
            val intent = Intent(this, SeaImageActivity::class.java)
            startActivity(intent)
        }
    }
}