package com.example.kotlincompose.feature_note.data.repasitory

import androidx.compose.foundation.lazy.rememberLazyListState
import com.example.kotlincompose.feature_note.data.data_source.NoteDao
import com.example.kotlincompose.feature_note.domain.model.Note
import com.example.kotlincompose.feature_note.domain.repasitory.NoteRepasitory
import kotlinx.coroutines.flow.Flow

class NoteRepasitoryImpl(
    private val dao: NoteDao
) : NoteRepasitory {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

}