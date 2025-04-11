package com.example.cateringapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Temukan View Menu button
        val viewMenuButton = findViewById<LinearLayout>(R.id.btnViewMenu)
        viewMenuButton.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val lihatPesananButton = findViewById<LinearLayout>(R.id.btnLihatPesanan)
        lihatPesananButton.setOnClickListener {
            val intent = Intent(this, OrdersActivity::class.java)
            startActivity(intent)
        }
    }
}
