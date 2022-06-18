package com.example.kotlincompose.feature_note.peresention.util

sealed class Screen(val route : String){
    object NotesScreen : Screen("note_Screen")
    object AddEditNoteScreen : Screen("add_edit_note_screen")
}
