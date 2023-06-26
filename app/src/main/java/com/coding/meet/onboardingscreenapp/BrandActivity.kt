package com.coding.meet.onboardingscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class BrandActivity : AppCompatActivity() {
//    here your splash screen api and other operation perform
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand)

    }

    override fun onStart() {
        super.onStart()
        isFirstTime()
    }

    private fun isFirstTime(){
        Handler(Looper.getMainLooper()).postDelayed({
            val sharedPreferenceManger = SharedPreferenceManger(this)
            if (sharedPreferenceManger.isFirstTime) {
                startActivity(Intent(this, OnBoardingActivity::class.java))
                finish()
            }else{
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        },2000)
    }
}