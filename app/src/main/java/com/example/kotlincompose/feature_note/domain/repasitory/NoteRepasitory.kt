package com.example.kotlincompose.feature_note.domain.repasitory

import com.example.kotlincompose.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepasitory {

    fun getNotes() : Flow<List<Note>>

    suspend fun getNoteById(id:Int) : Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}