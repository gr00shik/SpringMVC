package com.gr00shik.controllers;

import com.gr00shik.dao.units.Note;
import com.gr00shik.dao.units.User;
import com.gr00shik.services.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class NotesController {

    private List<Note> noteList;
    private Map<String, Object> mapModel = new HashMap<>();
    private NoteService noteService = new NoteService();

    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    public ModelAndView goNotes(@ModelAttribute("user") User user) {
        noteList = noteService.getListNotes();
        mapModel.clear();
        mapModel.put("noteList", noteList);
        mapModel.put("newNote", new Note());
        return new ModelAndView("notes", mapModel);
    }

    @RequestMapping(value = "/addNewNote", method = RequestMethod.POST)
    public String addNotes(@ModelAttribute("newNote") Note note) {
        noteService.addNewNote(note);
        return "forward:notes";
    }
}
