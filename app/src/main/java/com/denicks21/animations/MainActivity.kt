package com.denicks21.animations

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Animations
        // Bounce
        val animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val btnBounce: Button = findViewById(R.id.btnBounce)
        btnBounce.setOnClickListener {
            val txtFadeIn: TextView = findViewById(R.id.txt_bounce)
            txtFadeIn.setVisibility(View.VISIBLE)
            txtFadeIn.startAnimation(animBounce)
        }

        // Fade in
        val animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val btnFadeIn: Button = findViewById(R.id.btnFadeIn)
        btnFadeIn.setOnClickListener {
            val txtFadeIn: TextView = findViewById(R.id.txt_fade_in)
            txtFadeIn.setVisibility(View.VISIBLE)
            txtFadeIn.startAnimation(animFadeIn)
        }

        // Fade out
        val animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        val btnFadeOut: Button = findViewById(R.id.btnFadeOut)
        btnFadeOut.setOnClickListener {
            val txtFadeOut: TextView = findViewById(R.id.txt_fade_out)
            txtFadeOut.setVisibility(View.VISIBLE)
            txtFadeOut.startAnimation(animFadeOut)
        }

        // Flash
        val animFlash = AnimationUtils.loadAnimation(this, R.anim.flash)
        val btnFlash: Button = findViewById(R.id.btnFlash)
        btnFlash.setOnClickListener {
            val txtFlash: TextView = findViewById(R.id.txt_flash)
            txtFlash.setVisibility(View.VISIBLE)
            txtFlash.startAnimation(animFlash)
        }

        // Rotate
        val animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val btnRotate: Button = findViewById(R.id.btnRotate)
        btnRotate.setOnClickListener {
            val txtRotate: TextView = findViewById(R.id.txt_rotate)
            txtRotate.setVisibility(View.VISIBLE)
            txtRotate.startAnimation(animRotate)
        }

        // Sequence
        val animSequence = AnimationUtils.loadAnimation(this, R.anim.sequence)
        val btnSequence: Button = findViewById(R.id.btnSequence)
        btnSequence.setOnClickListener {
            val txtSequence: TextView = findViewById(R.id.txt_sequence)
            txtSequence.setVisibility(View.VISIBLE)
            txtSequence.startAnimation(animSequence)
        }

        // Shift
        val animShift = AnimationUtils.loadAnimation(this, R.anim.shift)
        val btnShift: Button = findViewById(R.id.btnShift)
        btnShift.setOnClickListener {
            val txtShift: TextView = findViewById(R.id.txt_shift)
            txtShift.setVisibility(View.VISIBLE)
            txtShift.startAnimation(animShift)
        }

        // Swipe down
        val animSwipeDown = AnimationUtils.loadAnimation(this, R.anim.swipe_down)
        val btnSwipeDown: Button = findViewById(R.id.btnSwipeDown)
        btnSwipeDown.setOnClickListener {
            val txtSwipeDown: TextView = findViewById(R.id.txt_swipe_down)
            txtSwipeDown.setVisibility(View.VISIBLE)
            txtSwipeDown.startAnimation(animSwipeDown)
        }

        // Swipe up
        val animSwipeUp = AnimationUtils.loadAnimation(this, R.anim.swipe_up)
        val btnSwipeUp: Button = findViewById(R.id.btnSwipeUp)
        btnSwipeUp.setOnClickListener {
            val txtSwipeUp: TextView = findViewById(R.id.txt_swipe_up)
            txtSwipeUp.setVisibility(View.VISIBLE)
            txtSwipeUp.startAnimation(animSwipeUp)
        }

        // Turn
        val animTurn = AnimationUtils.loadAnimation(this, R.anim.turn)
        val btnTurn: Button = findViewById(R.id.btnTurn)
        btnTurn.setOnClickListener {
            val txtTurn: TextView = findViewById(R.id.txt_turn)
            txtTurn.setVisibility(View.VISIBLE)
            txtTurn.startAnimation(animTurn)
        }

        // Zoom in
        val animZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val btnZoomIn: Button = findViewById(R.id.btnZoomIn)
        btnZoomIn.setOnClickListener {
            val txtZoomIn: TextView = findViewById(R.id.txt_zoom_in)
            txtZoomIn.setVisibility(View.VISIBLE)
            txtZoomIn.startAnimation(animZoomIn)
        }

        // Zoom out
        val animZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
        val btnZoomOut: Button = findViewById(R.id.btnZoomOut)
        btnZoomOut.setOnClickListener {
            val txtZoomOut: TextView = findViewById(R.id.txt_zoom_out)
            txtZoomOut.setVisibility(View.VISIBLE)
            txtZoomOut.startAnimation(animZoomOut)
        }
    }
}