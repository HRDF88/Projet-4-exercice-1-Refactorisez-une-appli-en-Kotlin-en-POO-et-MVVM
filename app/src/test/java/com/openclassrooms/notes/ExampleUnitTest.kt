package com.openclassrooms.notes

import android.provider.ContactsContract.CommonDataKinds.Note
import com.openclassrooms.notes.repository.NotesRepository
import com.openclassrooms.notes.service.LocalNotesApiService
import com.openclassrooms.notes.service.NotesApiService
import kotlinx.coroutines.flow.count
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    /**
     * Count the number of notes in the class LocalNotesApiService
     */
    @Test
    fun countNotes_inLocalNotesApiService(){
        val countNotesLocalApiService = LocalNotesApiService().getAllNotes().size
        assertEquals(10,countNotesLocalApiService)
    }

    /**
     * Count the number of notes in the repository
     */
    @Test
    fun countNotes_inNotesRepository(){
        val countNotesRepository = NotesRepository().notes
        assertEquals(10,countNotesRepository)
    }
}