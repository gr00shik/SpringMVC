package com.gr00shik.dao.hibernate;

import com.gr00shik.dao.units.Note;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("notesFunction")
public interface NotesFunction {
    List<Note> getNotesList();

    void addNote(Note note);

}
