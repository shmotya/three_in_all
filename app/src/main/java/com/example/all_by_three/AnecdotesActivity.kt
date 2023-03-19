package com.example.all_by_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_by_three.databinding.ActivityAnecdotesBinding
import com.example.all_by_three.databinding.ActivityMainBinding

class AnecdotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnecdotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnecdotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibBackAnecdotes.setOnClickListener {
            val intent = Intent(this, AnecdotesActivity::class.java)
            startActivity(intent)
        }

    }
}