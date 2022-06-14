package com.ntech.quizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Stand_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stand)

        val btn_back:Button = findViewById(R.id.btn_back)
        val btn_1: Button = findViewById(R.id.btn_1)
        val btn_2: Button = findViewById(R.id.btn_2)
        val btn_3: Button = findViewById(R.id.btn_3)
        val btn_4: Button = findViewById(R.id.btn_4)
        val btn_5: Button = findViewById(R.id.btn_5)

        btn_back.setOnClickListener {
            val intent = Intent(this, EnterNameActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_1.setOnClickListener {
            val intent = Intent(this, Std1_Activity::class.java)
            startActivity(intent)
            finish()
        }

        btn_2.setOnClickListener {
            val intent = Intent(this, Std2_Activity::class.java)
            startActivity(intent)
            finish()
        }

        btn_3.setOnClickListener {
            val intent = Intent(this, Std3_Activity::class.java)
            startActivity(intent)
            finish()
        }

        btn_4.setOnClickListener {
            val intent = Intent(this, Std4_Activity::class.java)
            startActivity(intent)
            finish()
        }
        btn_5.setOnClickListener {
            val intent = Intent(this, Std5_Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}