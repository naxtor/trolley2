package com.trolley.app.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.trolley.app.R
import com.trolley.app.data.Product
import com.trolley.app.data.listProduct
import com.trolley.app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val productListAdapter by lazy { ProductListAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.apply {
            rvProduct.apply {
                layoutManager = LinearLayoutManager(this@HomeActivity)
                setHasFixedSize(true)
                adapter = productListAdapter
                productListAdapter.submitList(listProduct)
            }
        }
    }
}