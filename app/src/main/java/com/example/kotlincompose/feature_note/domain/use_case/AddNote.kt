package com.example.kotlincompose.feature_note.domain.use_case

import com.example.kotlincompose.feature_note.domain.model.InValidNoteException
import com.example.kotlincompose.feature_note.domain.model.Note
import com.example.kotlincompose.feature_note.domain.repasitory.NoteRepasitory
import java.io.InvalidClassException

class AddNote(
    private val repasitory: NoteRepasitory
) {

    @Throws(InValidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
             throw InValidNoteException("The Title of be can't")
        }
        if (note.content.isBlank()){
            throw InValidNoteException("The content of be can't")
        }
        repasitory.insertNote(note)
    }
}