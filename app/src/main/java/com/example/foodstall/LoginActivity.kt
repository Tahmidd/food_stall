package com.example.foodstall

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodstall.databinding.ActivityLoginScreenBinding
import com.example.foodstall.databinding.ActivityStartBinding

class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginScreenBinding by lazy {
        ActivityLoginScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.dontHaveButton.setOnClickListener{
            val intent= Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.loginButton.setOnClickListener{
            val intent = Intent(this, ChooseLocationActivity::class.java)
            startActivity(intent)
        }

    }
}