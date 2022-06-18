package com.example.kotlincompose.feature_note.peresention.notes

import com.example.kotlincompose.feature_note.domain.model.Note
import com.example.kotlincompose.feature_note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note : Note): NotesEvent()
    object RestoreNote : NotesEvent()
    object TaggleOrderSection : NotesEvent()
}
