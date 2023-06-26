package com.coding.meet.onboardingscreenapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

class SharedPreferenceManger(context: Context) {

    private val preference = context.getSharedPreferences(
        context.getString(R.string.app_name), AppCompatActivity.MODE_PRIVATE
    )

    private val editor = preference.edit()


    private val keyIsFirstTime = "isFirstTime"

    var isFirstTime
        get() = preference.getBoolean(keyIsFirstTime, true)
        set(value) {
            editor.putBoolean(keyIsFirstTime, value)
            editor.commit()
        }
}