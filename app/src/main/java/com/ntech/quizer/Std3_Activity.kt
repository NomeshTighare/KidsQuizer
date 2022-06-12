package com.ntech.quizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Std3_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_std3)
        val btn_back2: Button = findViewById(R.id.btn_back2)
        val btn_next2: Button = findViewById(R.id.btn_next2)
        val tv1: TextView = findViewById(R.id.tv_1)
        val tv2: TextView = findViewById(R.id.tv_2)
        val tv3: TextView = findViewById(R.id.tv_3)
        val tv4: TextView = findViewById(R.id.tv_4)

        btn_back2.setOnClickListener {
            val intent = Intent(this, Stand_Activity::class.java)
            startActivity(intent)
            finish()
        }
        btn_next2.setOnClickListener {
            val intent = Intent(this, QuestionsStd3Math::class.java)
            startActivity(intent)
            finish()
        }

        tv1.setOnClickListener {
            val intent = Intent(this, QuestionsStd3English::class.java)
            startActivity(intent)
            finish()
        }
        tv2.setOnClickListener {
            val intent = Intent(this, QuestionsStd3Math::class.java)
            startActivity(intent)
            finish()
        }

        tv3.setOnClickListener {
            val intent = Intent(this, QuestionsStd3Gkn::class.java)
            startActivity(intent)
            finish()
        }
        tv4.setOnClickListener {
            val intent = Intent(this, QuestionsStd3Evn::class.java)
            startActivity(intent)
            finish()
        }
    }
}