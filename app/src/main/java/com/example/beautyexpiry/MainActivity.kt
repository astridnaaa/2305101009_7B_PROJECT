package com.example.beautyexpiry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tombol untuk membuka halaman Add Product
        val btnAddProduct = findViewById<Button>(R.id.btnAddProduct)

        btnAddProduct.setOnClickListener {
            val intent = Intent(this, AddProductActivity::class.java)
            startActivity(intent)
        }

        // Tombol untuk membuka halaman My Products
        val btnMyProducts = findViewById<Button>(R.id.btnMyProducts)

        btnMyProducts.setOnClickListener {
            val intent = Intent(this, ProductListActivity::class.java)
            startActivity(intent)
        }
    }
}
