package com.example.contactbookfinalproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.contactbookfinalproject.R
import java.util.ArrayList

class MyCustomAdapter(var ctx: Context, var ourResource: Int,
                      var Items: ArrayList<com.example.contactbookfinalproject.Model>
): ArrayAdapter<com.example.contactbookfinalproject.Model>(ctx, ourResource, Items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        //go to layout and get the links to our items
        val name = view.findViewById<TextView>(R.id.nameCLTV)
        val phone = view.findViewById<TextView>(R.id.phoneCLTV)
        val address = view.findViewById<TextView>(R.id.addressCLTV)
        val email = view.findViewById<TextView>(R.id.emailCLTV)
        val birthday = view.findViewById<TextView>(R.id.birthdayCLTV)

        name.text = Items[position].name
        phone.text = Items[position].number
        address.text = Items[position].address
        email.text = Items[position].email
        birthday.text = Items[position].birth


        return view
    }
}