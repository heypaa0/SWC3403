package com.grocery.GroceryStore.di

import com.grocery.GroceryStore.ui.cart.CartViewModel
import com.grocery.GroceryStore.ui.detailproduct.DetailProductViewModel
import com.grocery.GroceryStore.ui.explore.ExploreViewModel
import com.grocery.GroceryStore.ui.favorite.FavoriteViewModel
import com.grocery.GroceryStore.ui.product.ProductViewModel
import com.grocery.GroceryStore.ui.shop.ShopViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ShopViewModel(get()) }
    viewModel { ProductViewModel(get()) }
    viewModel { DetailProductViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { ExploreViewModel(get()) }
    viewModel { CartViewModel(get()) }
}