package com.example.contactbookfinalproject

import android.content.Intent
import android.graphics.ColorSpace.Model
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView


class ContactListScreen : AppCompatActivity() {
    private var name:String? = ""
    private var phone:String? = ""
    private var address:String? = ""
    private var email: String? = ""
    private var birthday:String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list_screen)

        val addContactFAB = findViewById<Button>(R.id.addContactFAB)
        val contactListView = findViewById<ListView>(R.id.contactList)

        addContactFAB.setOnClickListener{
            startActivity(Intent(this@ContactListScreen, CreateAndEdit::class.java))
        }

        var list = ArrayList<Model>()


    }
}