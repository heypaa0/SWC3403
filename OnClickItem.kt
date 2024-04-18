package com.grocery.GroceryStore.listener

import com.grocery.GroceryStore.model.product.ProductEntity

interface OnClickItem {
    fun onClick(productEntity: ProductEntity)
}

interface OnClickItemAndAdd {
    fun onClick(productEntity: ProductEntity)
    fun onClickAdd(productEntity: ProductEntity)
}

interface OnClickItemAddRemove {
    fun onClick(productEntity: ProductEntity)
    fun onClickAdd(productEntity: ProductEntity)
    fun onClickSubtract(productEntity: ProductEntity)
    fun onClickRemove(productEntity: ProductEntity)

    fun onClickSubstract(productEntity: ProductEntity)
}

