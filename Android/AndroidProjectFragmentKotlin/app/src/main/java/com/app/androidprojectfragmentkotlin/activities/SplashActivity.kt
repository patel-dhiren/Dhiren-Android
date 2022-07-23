package com.app.androidprojectfragmentkotlin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.androidprojectfragmentkotlin.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread(
            Runnable {
                Thread.sleep(3000)
                // navigate to login screen
                startActivity(Intent(this, IntroActivity::class.java))
            }
        ).start()

    }
}