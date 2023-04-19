package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        var btn = findViewById<Button>(R.id.buttonSignIn)
//        btn.setOnClickListener {
//            val intent = Intent(this,CongratulationsScreen::class.java)
//            startActivity(intent)
//        }

    }

    override fun onPause() {
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun GoToLoginScreen(view: View) {
        val n = findViewById<EditText>(R.id.nameTextField)
        var name = n.text
        Toast.makeText(this,"Congratulations...$name", Toast.LENGTH_SHORT).show()
        /*
        val intent = Intent(this,CongratulationsScreen::class.java)
        startActivity(intent)
        */
    }

}