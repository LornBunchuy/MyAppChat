package com.example.myappchat.ui.screen.auth

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myappchat.R
import com.example.myappchat.databinding.ActivityReigsterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding : ActivityReigsterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityReigsterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this@RegisterActivity, VerifyActivity::class.java)
            startActivity(intent)
        }
        binding.lbLogin.setOnClickListener {
            finish()
        }
    }
}