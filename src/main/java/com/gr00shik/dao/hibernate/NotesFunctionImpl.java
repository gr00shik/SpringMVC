package com.gr00shik.dao.hibernate;

import com.gr00shik.dao.units.Note;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class NotesFunctionImpl implements NotesFunction {
    private Session session;
    @Override
    public List<Note> getNotesList() {
        session =HiberUtils.getSessionFactory().openSession();
        Criteria query = session.createCriteria(Note.class);
        List<Note> list = (ArrayList<Note>)query.list();
        session.close();
        return  list;
    }

    @Override
    public void addNote(Note note) {
        session =HiberUtils.getSessionFactory().openSession();
        session.save(note);
        session.close();
    }
}
