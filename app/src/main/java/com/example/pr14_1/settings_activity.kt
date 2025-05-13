package com.example.pr14_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class settings_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    fun BackToLogin(view: View) {

        val intend = Intent(this@settings_activity,UserLoginActivity::class.java)
        startActivity(intend)
        finish()

    }

    fun ToTasks(view: View) {

        val intend = Intent(this@settings_activity,EditTaskActivity::class.java)
        startActivity(intend)
        finish()
    }

    fun ToAlarms(view: View) {

        val intend = Intent(this@settings_activity,CreateAlarmActivity::class.java)
        startActivity(intend)
        finish()

    }
}