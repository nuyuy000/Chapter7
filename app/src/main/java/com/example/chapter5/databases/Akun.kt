package com.example.chapter5.databases

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "akun")
data class Akun(
    @PrimaryKey(autoGenerate = true)
    var id :Int?,
    @ColumnInfo(name ="username")
    var username : String?,
    @ColumnInfo(name = "password")
    var password : String?,
//    @ColumnInfo(name = "email")
//    var email : String?,
)

