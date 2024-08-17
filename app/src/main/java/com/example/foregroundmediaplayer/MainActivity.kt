package com.example.foregroundmediaplayer

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foregroundmediaplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.start.setOnClickListener {
            intent(1)
        }
        binding.pause.setOnClickListener {
            intent(2)
        }
        binding.stop.setOnClickListener {
            intent(3)
        }



    }
    private fun intent(cdoe:Int){
        Intent(this,MyService::class.java).also {
            it.putExtra("CODE",cdoe)
            startService(it)
        }
    }

}