package com.dev.financetracker

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)var id: Int,
    var label: String,
    var amount: Double,
    var description: String): Serializable
{
    constructor() : this(0, "", 0.0, "")



}
