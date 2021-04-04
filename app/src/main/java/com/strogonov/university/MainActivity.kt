package com.strogonov.university

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        var et_email = findViewById(R.id.et_email) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_login = findViewById(R.id.btn_login) as Button
        var btn_reg = findViewById(R.id.btn_signup) as Button
        //переход ко второму активити

        btn_reg.setOnClickListener{
            val intent = Intent(this@MainActivity, SignInActivity::class.java)
            startActivity(intent)
            }
        // set on-click listener
        btn_login.setOnClickListener {
            val user_name = et_email.text;
            val password = et_password.text;
            val intent = Intent(this@MainActivity, University::class.java)
            startActivity(intent)

            // your code to validate the user_name and password combination
            // and verify the same

        }
    }


}