package com.nisa.loginkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = PlayFragment.newInstance()
        addFragment(mainFragment)


        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")

        tv_name.text = name
        tv_email.text = email

        supportActionBar?.hide()


        iv_play.setOnClickListener {
            val fragmentPlay = PlayFragment()
            val move = supportFragmentManager.beginTransaction()
            move.replace(R.id.fm_main, fragmentPlay).commit()
        }

            iv_modeEdit.setOnClickListener {
                val fragmentEdit = EditFragment()
                val move = supportFragmentManager.beginTransaction()
                move.replace(R.id.fm_main, fragmentEdit).commit()

            }

        }

    private fun addFragment(fragment: PlayFragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fm_main, fragment, fragment::class.java.simpleName)
            .commit()

    }
}

