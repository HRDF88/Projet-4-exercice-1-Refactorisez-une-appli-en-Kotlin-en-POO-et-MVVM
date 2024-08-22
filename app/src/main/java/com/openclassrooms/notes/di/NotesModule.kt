package com.openclassrooms.notes.di

import android.app.Application
import android.content.Context
import com.openclassrooms.notes.repository.NotesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NotesModule {

    @Singleton
    @Provides
    fun provideNotesApplication(@ApplicationContext application: Context) : NotesApplication{
        return application as NotesApplication
    }

    @Singleton
    @Provides
    fun provideContext(application : Application): Context = application

    @Singleton
    @Provides
    fun provideNotesRepository() : NotesRepository{
        return NotesRepository()
    }
}