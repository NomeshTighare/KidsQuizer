package com.ntech.quizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlogin: Button = findViewById(R.id.btn_login)
        val tv_acc: TextView = findViewById(R.id.tv_acc)
        val username : EditText = findViewById(R.id.edtuser)
        val password : EditText = findViewById(R.id.edtpass)
        btnlogin.setOnClickListener{
            val username1:String = username.text.toString()
            val userpass:String = password.text.toString()

            if (username1.equals("admin") && userpass.equals("admin"))
            {
                val intent = Intent(this, EnterNameActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
                finish()
            }
            else
            {
                Toast.makeText(this,"Invalid Credentials",Toast.LENGTH_LONG).show()
            }

//            val intent = Intent(this, EnterNameActivity::class.java)
//            startActivity(intent)
//            finish()

        }

        tv_acc.setOnClickListener{
            val intent = Intent(this, Reg_Activity::class.java)
            startActivity(intent)
            finish()

        }

    }
}