package com.example.contactbookfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView


class ContactListScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list_screen)

        val addContactFAB = findViewById<Button>(R.id.addContactFAB)
        val contactList = findViewById<ListView>(R.id.contactList)

        addContactFAB.setOnClickListener{
            startActivity(Intent(this@ContactListScreen, CreateAndEdit::class.java))
        }



    }
}