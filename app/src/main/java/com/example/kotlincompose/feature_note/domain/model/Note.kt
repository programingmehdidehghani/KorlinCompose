package com.example.kotlincompose.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.kotlincompose.ui.theme.*

@Entity
data class Note(
    val title:String,
    val content:String,
    val timeStamp:Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InValidNoteException(message : String) : Exception(message)
