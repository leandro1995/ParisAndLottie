package com.leandro1995.parisandlottie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leandro1995.parisandlottie.activity.LottieActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lottieButton.setOnClickListener {
            startActivity(Intent(this, LottieActivity::class.java))
        }

        parisButton.setOnClickListener { }
    }
}