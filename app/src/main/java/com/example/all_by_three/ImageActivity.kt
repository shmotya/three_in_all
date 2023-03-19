package com.example.all_by_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_by_three.databinding.ActivityImageBinding
import com.example.all_by_three.databinding.ActivityMainBinding

class ImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibBackImages.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }

    }
}