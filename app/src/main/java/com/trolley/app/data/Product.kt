package com.trolley.app.data

data class Product(
    val id: Int,
    val name: String,
    val price: String,
    val image: String,
    val description: String,
)

val listProduct = listOf(
    Product(
        id = 1,
        name = "Beras Sania",
        price = "Rp. 14.000",
        image = "https://sumberjayagrosir.com/assets/images/product/1668078064340.jpg",
        description = "Beras 1kg"
    ),
    Product(
        id = 2,
        name = "Minyak Goreng Minyak Kita (botol)",
        price = "Rp. 16.000",
        image = "https://sumberjayagrosir.com/assets/images/product/1659311831860.jpg",
        description = "Minyak Goreng 1L"
    ),
    Product(
        id = 3,
        name = "Gula Rose Brand",
        price = "Rp. 15.000",
        image = "https://sumberjayagrosir.com/assets/images/product/1673064475191.jpg",
        description = "Gula 1kg"
    )
)
