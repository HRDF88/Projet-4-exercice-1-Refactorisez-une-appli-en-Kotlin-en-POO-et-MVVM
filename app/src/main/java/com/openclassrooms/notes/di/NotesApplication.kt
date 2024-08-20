package com.openclassrooms.notes.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * NotesApplication is responsible for providing application-level dependencies.
 */
@HiltAndroidApp
public class NotesApplication :Application(){


}