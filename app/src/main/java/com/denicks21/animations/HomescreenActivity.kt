package com.denicks21.animations

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomescreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        val backgroundText: TextView = findViewById(R.id.textView)
        val textAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        backgroundText.startAnimation(textAnimation)

        val backgroundImage: ImageView = findViewById(R.id.imageView)
        val imageAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        backgroundImage.startAnimation(imageAnimation)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            // Time in milliseconds
        }, 2100)
    }
}