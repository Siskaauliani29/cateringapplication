package com.example.cateringapplication
data class ItemPesanan(
    val nama: String,
    val harga: Int
)

object OrderManager {
    val orders = mutableListOf<ItemPesanan>()
    var totalHarga = 0

    fun tambahPesanan(namaMenu: String, harga: Int) {
        orders.add(ItemPesanan(namaMenu, harga))
        totalHarga += harga
    }

    fun getTotalAmount(): Int = totalHarga

    fun hapusPesanan(index: Int) {
        if (index in orders.indices) {
            totalHarga -= orders[index].harga
            orders.removeAt(index)
        }
    }

    fun konfirmasiPesanan() {
        orders.clear()
        totalHarga = 0
    }
}
