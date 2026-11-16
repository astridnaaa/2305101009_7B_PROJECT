package com.example.beautyexpiry

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class AddProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        val etExpirationDate = findViewById<EditText>(R.id.etExpirationDate)

        etExpirationDate.setOnClickListener {
            val calendar = Calendar.getInstance()

            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(
                this,
                { _, selectedYear, selectedMonth, selectedDay ->
                    val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                    etExpirationDate.setText(selectedDate)
                },
                year,
                month,
                day
            )

            datePicker.show()
        }
    }
}
