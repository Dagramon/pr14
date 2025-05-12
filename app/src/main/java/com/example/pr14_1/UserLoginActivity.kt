package com.example.pr14_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UserLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
    }

    fun enter(view: View)
    {
        val intend = Intent(this@UserLoginActivity,EditTaskActivity::class.java)
        startActivity(intend)
        finish()
    }
}