package com.grocery.GroceryStore.di

import com.grocery.GroceryStore.data.DummyDataSource
import com.grocery.GroceryStore.data.Repository
import com.grocery.GroceryStore.model.DataBase
import org.koin.dsl.module

val dataModule = module {

    single { DataBase.getInstance() }
    factory { DummyDataSource() }
    single { Repository(get(), get()) }

}