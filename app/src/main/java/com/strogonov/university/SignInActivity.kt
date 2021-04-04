package com.strogonov.university

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var btn_Ok = findViewById(R.id.btn_Ok) as Button
        btn_Ok.setOnClickListener{
            val intent = Intent(this@SignInActivity, University::class.java)
            startActivity(intent)
        }
    }
}