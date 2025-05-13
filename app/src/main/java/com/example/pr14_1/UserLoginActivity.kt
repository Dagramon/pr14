package com.example.pr14_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class UserLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
    }

    fun Enter(view: View)
    {

        var username = findViewById<EditText>(R.id.username)
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)

        if (!username.text.isEmpty() && !email.text.isEmpty() && !password.text.isEmpty())
        {
            val intend = Intent(this@UserLoginActivity,settings_activity::class.java)
            startActivity(intend)
            finish()
        }
        else
        {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }

    fun Leave(view: View)
    {
        this.finishAffinity()
    }
}