package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.diceStartBtn.setOnClickListener {

            Toast.makeText(this, "주사위 go", Toast.LENGTH_LONG).show()

            Log.d("mainactivity", Random.nextInt(1,6).toString())
            Log.d("mainactivity", Random.nextInt(1,6).toString())
           // Random.nextInt(1,6)

        }
    }
}