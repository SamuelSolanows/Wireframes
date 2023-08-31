package com.example.wireframes

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.wireframes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fragmentos()

    }



    fun Fragmentos(){
        supportFragmentManager.commit {
            add(R.id.contenedor,Main())
            addToBackStack("Main")

            binding.apply {

            }
        }
    }
}