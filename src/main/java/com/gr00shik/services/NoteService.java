package com.gr00shik.services;

import com.gr00shik.dao.hibernate.NotesFunction;
import com.gr00shik.dao.hibernate.NotesFunctionImpl;
import com.gr00shik.dao.units.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private NotesFunction notesFunction=new NotesFunctionImpl();

    public List<Note> getListNotes() {
        return notesFunction.getNotesList();
    }

    public void addNewNote(Note note) {
        notesFunction.addNote(note);
    }
}

