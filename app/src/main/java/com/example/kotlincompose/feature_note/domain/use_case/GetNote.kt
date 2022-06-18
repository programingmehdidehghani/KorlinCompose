package com.example.kotlincompose.feature_note.domain.use_case

import com.example.kotlincompose.feature_note.domain.model.Note
import com.example.kotlincompose.feature_note.domain.repasitory.NoteRepasitory

class GetNote(
    private val repository : NoteRepasitory
) {

    suspend operator fun invoke(id:Int): Note?{
        return repository.getNoteById(id)
    }
}