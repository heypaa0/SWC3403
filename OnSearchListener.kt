package com.grocery.GroceryStore.listener

import com.grocery.GroceryStore.model.product.ProductEntity

interface OnSearchListener {
    fun onSearch(productEntity: ProductEntity)
}