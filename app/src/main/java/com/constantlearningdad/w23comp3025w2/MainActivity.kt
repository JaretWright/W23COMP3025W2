package com.constantlearningdad.w23comp3025w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.constantlearningdad.w23comp3025w2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toastButton.setOnClickListener {
            Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
        }

        binding.snackbarButton.setOnClickListener {
            Snackbar.make(binding.layout, "Snackbar message",Snackbar.LENGTH_LONG)
        }

    }
}