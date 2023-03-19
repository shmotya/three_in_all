package com.example.all_by_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_by_three.databinding.ActivityCitationsBinding
import com.example.all_by_three.databinding.ActivityMainBinding

class CitationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCitationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCitationsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ibBackCitations.setOnClickListener {
            val intent = Intent(this, CitationsActivity::class.java)
            startActivity(intent)
        }

    }
}