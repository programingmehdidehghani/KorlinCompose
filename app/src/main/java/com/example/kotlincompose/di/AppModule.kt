package com.example.kotlincompose.di

import android.app.Application
import androidx.room.Room
import com.example.kotlincompose.feature_note.data.data_source.NoteDatabase
import com.example.kotlincompose.feature_note.data.repasitory.NoteRepasitoryImpl
import com.example.kotlincompose.feature_note.domain.repasitory.NoteRepasitory
import com.example.kotlincompose.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application): NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepasitory(db : NoteDatabase) : NoteRepasitory{
        return NoteRepasitoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repasitory: NoteRepasitory) : NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repasitory),
            deleteNotes = DeleteNotes(repasitory),
            addNote = AddNote(repasitory),
            getNote = GetNote(repasitory)
        )
    }
}