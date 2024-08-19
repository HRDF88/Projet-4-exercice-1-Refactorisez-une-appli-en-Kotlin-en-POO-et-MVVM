package com.openclassrooms.notes.viewmodel

import com.openclassrooms.notes.model.Note
import com.openclassrooms.notes.repository.NotesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * MainViewModel is responsible for preparing and managing the data for the {@link activity_main}.
 * It communicates with the {@link NotesRepository} to fetch notes details and provides
 * utility methods related to the notes UI.
 * <p>
 * This ViewModel is integrated with Hilt for dependency injection.
 */
@HiltViewModel
class ViewModel() {

    /**
     * Fetches the list of notes in the repository.
     */
    val notesGetRepository = NotesRepository().notes
}
