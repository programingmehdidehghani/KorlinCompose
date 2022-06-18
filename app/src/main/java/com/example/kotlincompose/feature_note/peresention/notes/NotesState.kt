package com.example.kotlincompose.feature_note.peresention.notes

import com.example.kotlincompose.feature_note.domain.model.Note
import com.example.kotlincompose.feature_note.domain.util.NoteOrder
import com.example.kotlincompose.feature_note.domain.util.OrderType

data class NotesState (
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Dscending),
    val isOrderSectionVisible : Boolean = false
){
}