package com.example.mapnote.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "info")
data class marker_info_Entity(
    @PrimaryKey(autoGenerate = true)
    var id : Long?,
    var place_name : String,
    var memo : String,
    var time : String ,
    var lat : Long,
    var lng : Long)