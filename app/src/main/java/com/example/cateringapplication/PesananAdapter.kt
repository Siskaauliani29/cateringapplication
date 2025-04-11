package com.example.cateringapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PesananAdapter(private val listPesanan: List<ItemPesanan>) :
    RecyclerView.Adapter<PesananAdapter.PesananViewHolder>() {

    class PesananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtPesanan: TextView = itemView.findViewById(R.id.txtItemPesanan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PesananViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pesanan, parent, false)
        return PesananViewHolder(view)
    }

    override fun onBindViewHolder(holder: PesananViewHolder, position: Int) {
        val item = listPesanan[position]
        holder.txtPesanan.text = "🍽 ${item.nama} - Rp${item.harga}"
    }

    override fun getItemCount(): Int = listPesanan.size
}
