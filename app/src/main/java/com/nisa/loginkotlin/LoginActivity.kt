package com.nisa.loginkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var etname: String
    private lateinit var etemail: String
    private var fieldEmpty: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_submit.setOnClickListener {
            etname = et_name.text.toString().trim()
            etemail = et_email.text.toString().trim()

            if (etname.isEmpty()) {
                fieldEmpty = true
                et_name.error = resources.getString(R.string.error_empty_field)
            }
            if (etemail.isEmpty()) {
                fieldEmpty = true
                et_email.error = resources.getString(R.string.error_empty_field)


            }
            if (!fieldEmpty) {

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("name", etname)
                intent.putExtra("email", etemail)

                startActivity(intent)


            }
        }

    }
}
