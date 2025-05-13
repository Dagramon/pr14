package com.example.pr14_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CreateAlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alarm)
    }

    fun BackToSettingsAlarm(view: View) {

        val intend = Intent(this@CreateAlarmActivity,settings_activity::class.java)
        startActivity(intend)
        finish()

    }
}