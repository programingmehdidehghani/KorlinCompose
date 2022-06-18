package com.example.kotlincompose.feature_note.domain.use_case

import com.example.kotlincompose.feature_note.domain.model.Note
import com.example.kotlincompose.feature_note.domain.repasitory.NoteRepasitory

class DeleteNotes(
    private val repasitory: NoteRepasitory
) {

    suspend operator fun invoke(note: Note){
        repasitory.deleteNote(note)
    }
}