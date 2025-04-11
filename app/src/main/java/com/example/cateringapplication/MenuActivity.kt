package com.example.cateringapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnPesanMieGoreng = findViewById<Button>(R.id.btnPesanMieGoreng)
        val btnPesanNasiGoreng = findViewById<Button>(R.id.btnPesanNasiGoreng)
        val btnPesanNasiKebuli = findViewById<Button>(R.id.btnPesanNasiKebuli)
        val btnPesanNasiKuning = findViewById<Button>(R.id.btnPesanNasiKuning)
        val btnPesanNasiSambalMatah = findViewById<Button>(R.id.btnPesanNasiSambalMatah)
        val btnPesanNasiUduk = findViewById<Button>(R.id.btnPesanNasiUduk)
        val btnCheckout = findViewById<Button>(R.id.btnCheckout)

        btnPesanMieGoreng.setOnClickListener {
            OrderManager.tambahPesanan("Mie Goreng", 20000)
            Toast.makeText(this, "Mie Goreng ditambahkan!", Toast.LENGTH_SHORT).show()
        }

        btnPesanNasiGoreng.setOnClickListener {
            OrderManager.tambahPesanan("Nasi Goreng", 20000)
            Toast.makeText(this, "Nasi Goreng ditambahkan!", Toast.LENGTH_SHORT).show()
        }

        btnPesanNasiKebuli.setOnClickListener {
            OrderManager.tambahPesanan("Nasi Kebuli", 20000)
            Toast.makeText(this, "Nasi Kebuli ditambahkan!", Toast.LENGTH_SHORT).show()
        }

        btnPesanNasiKuning.setOnClickListener {
            OrderManager.tambahPesanan("Nasi Kuning", 20000)
            Toast.makeText(this, "Nasi Kuning ditambahkan!", Toast.LENGTH_SHORT).show()
        }

        btnPesanNasiSambalMatah.setOnClickListener {
            OrderManager.tambahPesanan("Nasi Sambal Matah", 20000)
            Toast.makeText(this, "Nasi Sambal Matah ditambahkan!", Toast.LENGTH_SHORT).show()
        }

        btnPesanNasiUduk.setOnClickListener {
            OrderManager.tambahPesanan("Nasi Uduk", 20000)
            Toast.makeText(this, "Nasi Uduk ditambahkan!", Toast.LENGTH_SHORT).show()
        }

        btnCheckout.setOnClickListener {
            // Intent to go to the Checkout screen (if you have it set up)
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }
}
