package com.arpit.expense.Model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arpit.expense.table_name

@Entity(tableName = table_name)
data class Transaction(
    @PrimaryKey(autoGenerate = true) val id:Int = 0,
    val amount: Int,
    val type: String,
    val time: Long
)