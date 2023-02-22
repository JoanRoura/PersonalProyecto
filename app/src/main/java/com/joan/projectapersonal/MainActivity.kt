package com.joan.projectapersonal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joan.projectapersonal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoToLogin.setOnClickListener {
            showLogin()
        }

        binding.buttonGoToRegister.setOnClickListener {
            showRegister()
        }

    }

    private fun showLogin() {
        val intentLoginActivity = Intent(this, LoginActivity::class.java)
        startActivity(intentLoginActivity)
    }

    private fun showRegister() {
        val intentRegisterActivity = Intent(this, RegisterActivity::class.java)
        startActivity(intentRegisterActivity)
    }
}