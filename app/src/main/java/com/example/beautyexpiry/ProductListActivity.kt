package com.example.beautyexpiry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProductListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        val btnAddNewProduct = findViewById<Button>(R.id.btnAddNewProduct)

        btnAddNewProduct.setOnClickListener {
            val intent = Intent(this, AddProductActivity::class.java)
            startActivity(intent)
        }

        val btnReminder = findViewById<Button>(R.id.btnReminder)

        btnReminder.setOnClickListener {
            val intent = Intent(this, ReminderActivity::class.java)
            startActivity(intent)
        }
    }
}
