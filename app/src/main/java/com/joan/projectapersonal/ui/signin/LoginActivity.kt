package com.joan.projectapersonal.ui.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.joan.projectapersonal.HomeActivity

import com.joan.projectapersonal.databinding.ActivityLoginBinding
import com.joan.projectapersonal.ui.signup.RegisterActivity

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var loginViewModel: LoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)



        binding.buttonSignIn.setOnClickListener {

        }
    }
}