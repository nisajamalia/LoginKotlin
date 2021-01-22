package com.nisa.loginkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dolpy.*

class DolpyActivity : AppCompatActivity() {

    private lateinit var signUp: String
    private lateinit var login: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dolpy)

        tv_to_sign_up.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            signUp = tv_to_sign_up.text.toString().trim()
        }

        tv_to_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            login = tv_to_login.text.toString().trim()
        }
    }
}
