package com.example.all_by_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_by_three.databinding.ActivityMainBinding
import com.example.all_by_three.databinding.ActivityOmensBinding

class OmensActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOmensBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOmensBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibBackOmens.setOnClickListener {
            val intent = Intent(this, AnecdotesActivity::class.java)
            startActivity(intent)
        }
    }
}