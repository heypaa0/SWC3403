package com.grocery.GroceryStore.model.product

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.grocery.GroceryStore.utill.ProductSavedType
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "product")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="pk")
    val pk: Int = 0,
    @ColumnInfo(name="id")
    val id: Int = 0,
    @ColumnInfo(name= "name")
    val name: String = "",
    @ColumnInfo(name= "picture")
    val picture: Int = 0,
    @ColumnInfo(name= "description")
    val description: String = "",
    @ColumnInfo(name= "price")
    val price: Int = 0,
    @ColumnInfo(name= "qty")
    val qty: Int = 0,
    @ColumnInfo(name = "type")
    val type: Int = ProductSavedType.FAV

): Parcelable{

    val priceToQty get() = qty * price
    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("Not yet implemented")
    }
}


