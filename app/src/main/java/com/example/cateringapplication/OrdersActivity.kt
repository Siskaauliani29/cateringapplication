package com.example.cateringapplication
import android.widget.Toast

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OrdersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerPesanan)
        val txtTotalHarga = findViewById<TextView>(R.id.txtTotalHarga)
        val btnViewMenu = findViewById<Button>(R.id.btnViewMenu)
        val btnKonfirmasi = findViewById<Button>(R.id.btnKonfirmasi)

        // Tampilkan daftar pesanan di RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = PesananAdapter(OrderManager.orders)
        recyclerView.adapter = adapter

        // Menampilkan total harga
        txtTotalHarga.text = getString(R.string.total_order, OrderManager.getTotalAmount().toString())

        // Aksi tombol
        btnViewMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        btnKonfirmasi.setOnClickListener {
            OrderManager.konfirmasiPesanan()
            adapter.notifyDataSetChanged()
            txtTotalHarga.text = "Total: Rp0"
            Toast.makeText(this, "Pesanan dikonfirmasi!", Toast.LENGTH_SHORT).show()
        }
    }
}
