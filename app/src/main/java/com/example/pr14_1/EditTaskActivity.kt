package com.example.pr14_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EditTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_task)
    }

    fun BackToSettingsTask(view: View) {

        val intend = Intent(this@EditTaskActivity,settings_activity::class.java)
        startActivity(intend)
        finish()

    }
}