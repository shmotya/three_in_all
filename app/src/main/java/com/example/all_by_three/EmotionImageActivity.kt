package com.example.all_by_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_by_three.databinding.ActivityEmotionImageBinding
import com.example.all_by_three.databinding.ActivityMainBinding

class EmotionImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmotionImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmotionImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibBackEmotions.setOnClickListener {
            val intent = Intent(this, EmotionImageActivity::class.java)
            startActivity(intent)
        }
    }
}