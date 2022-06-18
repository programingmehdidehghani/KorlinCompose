package com.example.kotlincompose.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNotes: DeleteNotes,
    val addNote: AddNote,
    val getNote: GetNote
)
