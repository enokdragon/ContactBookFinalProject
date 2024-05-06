package com.example.contactbookfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewContactBtn = findViewById<Button>(R.id.viewContactList)
        val makeContactBtn = findViewById<Button>(R.id.makeContactBtn)

        viewContactBtn.setOnClickListener{
            startActivity(Intent(this, ContactListScreen::class.java))
        }

        makeContactBtn.setOnClickListener{
            val startCreateEdit = Intent(this@MainActivity, CreateAndEdit::class.java)
            startActivity(Intent(startCreateEdit))
        }
    }
}