package com.example.contactbookfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ContactListScreen : AppCompatActivity() {
    private var name:String? = ""
    private var phone:String? = ""
    private var address:String? = ""
    private var email: String? = ""
    private var birthday:String? = ""

    var list = ArrayList<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list_screen)

        val addContactFAB = findViewById<FloatingActionButton>(R.id.addContactFAB)
        val contactListView = findViewById<ListView>(R.id.contactList)

        contactListView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

        addContactFAB.setOnClickListener{
            startActivity(Intent(this@ContactListScreen, CreateAndEdit::class.java))
        }





    }

    override fun onResume() {
        super.onResume()
        val contactListView = findViewById<ListView>(R.id.contactList)
        val extras = intent.extras
        if (extras != null) {
            name = extras.getString("Name")
            phone = extras.getString("Phone")
            address = extras.getString("Address")
            email = extras.getString("Email")
            birthday = extras.getString("Birth")
            list.add(Model(name.toString(), phone.toString(), address.toString(), email.toString(), birthday.toString()))
        }

        //contactListView.adapter.
                //create adapter

    }
}