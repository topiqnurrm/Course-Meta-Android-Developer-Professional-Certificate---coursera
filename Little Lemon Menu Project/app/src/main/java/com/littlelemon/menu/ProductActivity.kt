package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_IMAGE = "image"
        const val KEY_CATEGORY = "category"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title: String = intent.getStringExtra(KEY_TITLE) ?: "Error on get title"
        val price = intent.getDoubleExtra(KEY_PRICE, 0.0)
        val image = intent.getIntExtra(KEY_IMAGE, R.drawable.black_tea)
        val category = intent.getStringExtra(KEY_CATEGORY) ?: "Error on get category"
        val productItem =
            ProductItem(title, price, category, image)
        setContent { ProductDetails(productItem) }
    }
}