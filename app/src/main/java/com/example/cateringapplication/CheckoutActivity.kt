package com.example.cateringapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    private lateinit var totalTextView: TextView
    private lateinit var paymentMethodTextView: TextView
    private lateinit var btnSelesai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        // Initialize views
        totalTextView = findViewById(R.id.totalTextView)
        paymentMethodTextView = findViewById(R.id.paymentMethodTextView)
        btnSelesai = findViewById(R.id.btnSelesai)

        // Get the total from OrderManager
        val totalAmount = OrderManager.getTotalAmount()
        totalTextView.text = "Total Belanjaan: Rp $totalAmount"

        // Set payment method
        paymentMethodTextView.text = "Metode Pembayaran: Cash"

        // Handle the "Selesai" button click
        btnSelesai.setOnClickListener {
            completeOrder()
        }
    }

    private fun completeOrder() {
        // Simulate order completion process
        Toast.makeText(this, "Pesanan selesai!", Toast.LENGTH_SHORT).show()

        // Navigate back to the main screen or show a confirmation
        finish()
    }
}
