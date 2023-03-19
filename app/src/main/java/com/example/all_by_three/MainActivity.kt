package com.example.all_by_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_by_three.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btImages.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }
        binding.btAnecdotes.setOnClickListener {
            val intent = Intent(this, AnecdotesActivity::class.java)
            startActivity(intent)
        }
        binding.btOmens.setOnClickListener {
            val intent = Intent(this, OmensActivity::class.java)
            startActivity(intent)
        }
        binding.btCitations.setOnClickListener {
            val intent = Intent(this, CitationsActivity::class.java)
            startActivity(intent)
        }
        binding.btSeaImage.setOnClickListener {
            val intent = Intent(this, SeaImageActivity::class.java)
            startActivity(intent)
        }
        binding.btEmotionImages.setOnClickListener {
            val intent = Intent(this, EmotionImageActivity::class.java)
            startActivity(intent)
        }
        binding.btAboutAuthor.setOnClickListener {
            val intent = Intent(this, AuthorActivity::class.java)
            startActivity(intent)
        }


    }




}