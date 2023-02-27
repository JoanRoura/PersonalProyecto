package com.joan.projectapersonal.ui.introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.joan.projectapersonal.databinding.ActivityMainBinding
import com.joan.projectapersonal.ui.signin.LoginActivity
import com.joan.projectapersonal.ui.signup.RegisterActivity


class IntroductionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var introductionViewModel: IntroductionViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        InitListeners()
    }

    private fun InitListeners() {
        binding.buttonGoToLogin.setOnClickListener {

        }

        binding.buttonGoToRegister.setOnClickListener {

        }
    }

}