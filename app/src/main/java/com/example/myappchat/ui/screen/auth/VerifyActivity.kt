package com.example.myappchat.ui.screen.auth

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myappchat.R
import com.example.myappchat.databinding.ActivityVerifyBinding
import com.example.myappchat.utils.ToolbarUtils

class VerifyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerifyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityVerifyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_verify)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ToolbarUtils.setupToolbar(
            activity = this,
            titleText = "Back",
            leftIconRes = R.drawable.ic_back,
            iconLeftShow = true,
            leftClick = { onBackPressedDispatcher.onBackPressed() },
            rightIconRes = R.drawable.ic_profiles,
            iconRightShow = false,
            rightClick = { Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show() },
            titleCenter = false
        )
    }
}