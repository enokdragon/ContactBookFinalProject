package com.example.contactbookfinalproject
import android.content.Intent
import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class CreateAndEdit : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_and_edit)


        val name = findViewById<EditText>(R.id.nameET)
        val phone = findViewById<EditText>(R.id.phoneNumET)
        val address = findViewById<EditText>(R.id.addressET)
        val email = findViewById<EditText>(R.id.emailET)
        val birth = findViewById<EditText>(R.id.birthdayET)

        val saveBtn = findViewById<Button>(R.id.saveBtn)
        val deleteBtn = findViewById<Button>(R.id.deleteBtn)

        deleteBtn.setOnClickListener{
            if(name.toString() != ""){
                //search and delete contact
                Toast.makeText(this, "You have deleted the contact", Toast.LENGTH_SHORT)
                    .show()
                val deleteContact = Intent(this@CreateAndEdit, ContactListScreen::class.java)
                deleteContact.putExtra("Name", name.toString())


            }else{
                startActivity(Intent(this@CreateAndEdit, ContactListScreen::class.java))
            }
        }

        saveBtn.setOnClickListener{
            while (name.toString() == ""){
                Toast.makeText(this, "Please enter a name to save the contact", Toast.LENGTH_SHORT)
                    .show()
            }
            val addToList = Intent(this@CreateAndEdit, ContactListScreen::class.java)
            addToList.putExtra("Name", name.toString())
            addToList.putExtra("Phone", phone.toString())
            addToList.putExtra("Address", address.toString())
            addToList.putExtra("Email", email.toString())
            addToList.putExtra("Birthday", birth.toString())

            startActivity(addToList) //return to contact list page where we will add the contact to the array
        }
    }
}