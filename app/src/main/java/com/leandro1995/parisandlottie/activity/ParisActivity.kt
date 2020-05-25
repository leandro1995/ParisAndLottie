package com.leandro1995.parisandlottie.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.paris.extensions.style
import com.leandro1995.parisandlottie.R
import kotlinx.android.synthetic.main.activity_paris.*

class ParisActivity : AppCompatActivity() {

    private var status = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paris)

        actionButton.setOnClickListener {
            status = if (status) {
                styleButton.style(R.style.StyleOne)
                false
            } else {
                styleButton.style(R.style.StyleTwo)
                true
            }
        }
    }
}