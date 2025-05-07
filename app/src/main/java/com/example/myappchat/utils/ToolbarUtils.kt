package com.example.myappchat.utils

import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar  // Correct import
import androidx.appcompat.app.AppCompatActivity
import com.example.myappchat.R

object ToolbarUtils {
    fun setupToolbar(
        activity: AppCompatActivity,
        titleText: String,
        leftIconRes: Int? = null,
        iconLeftShow: Boolean = false,
        leftClick: (() -> Unit)? = null,
        rightIconRes: Int? = null,
        iconRightShow: Boolean = false,
        rightClick: (() -> Unit)? = null,
        titleCenter: Boolean = false
    ) {
        val toolbar = activity.findViewById<Toolbar>(R.id.customToolbar)
        if (toolbar == null) {
            Log.e("ToolbarUtils", "Toolbar with ID customToolbar not found!")
            return
        }
        activity.setSupportActionBar(toolbar)

        activity.supportActionBar?.setDisplayShowTitleEnabled(false)
        val title = toolbar.findViewById<TextView>(R.id.toolbarTitle)
        val leftIcon = toolbar.findViewById<ImageView>(R.id.leftIcon)
        val rightIcon = toolbar.findViewById<ImageView>(R.id.rightIcon)

        title.text = titleText

        // Title alignment
        val layoutParams = Toolbar.LayoutParams(
            Toolbar.LayoutParams.WRAP_CONTENT,
            Toolbar.LayoutParams.WRAP_CONTENT
        )

        layoutParams.gravity = if (titleCenter) {
            Gravity.CENTER
        } else {
            Gravity.START or Gravity.CENTER_VERTICAL
        }

        title.layoutParams = layoutParams
        title.gravity = layoutParams.gravity

        // Left icon
        if (iconLeftShow && leftIconRes != null && leftClick != null) {
            leftIcon.visibility = View.VISIBLE
            leftIcon.setImageResource(leftIconRes)
            leftIcon.setOnClickListener { leftClick() }
        } else {
            leftIcon.visibility = View.GONE
        }

        // Right icon
        if (iconRightShow && rightIconRes != null && rightClick != null) {
            rightIcon.visibility = View.VISIBLE
            rightIcon.setImageResource(rightIconRes)
            rightIcon.setOnClickListener { rightClick() }
        } else {
            rightIcon.visibility = View.GONE
        }
    }
}
