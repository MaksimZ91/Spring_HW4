package com.example.Spring_HW4.controller;

import com.example.Spring_HW4.models.Note;
import com.example.Spring_HW4.service.NoteService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Log
@AllArgsConstructor
public class NoteController {
    /**
     * Объект сервиса заметок.
     */
    private final NoteService noteService;

    /**
     * Получение всех заметок либо стартовой станицы если заметок нет.
     * @return шаблон страницы
     */
    @RequestMapping("/")
    public String home(){
        List<Note> notes = noteService.findAll();
        return (!notes.isEmpty())?"index":"home";
    }

    /**
     * Получение списка заметок.
     * @param model объект модели для шаблонизатора.
     * @return шаблон со списком заметок.
     */
    @RequestMapping("/noteList")
    public String noteList(Model model){
        List<Note> notes = noteService.findAll();
        model.addAttribute("notes", notes);
        return "index";
    }

    /**
     * Создание новой заметки
     * @param model объект модели для шаблонизатора.
     * @param note объект новой заметки.
     * @return шаблон со списком заметок.
     */    @RequestMapping("/create")
    public String create(Model model, Note note){
        noteService.save(note);
        List<Note> notes = noteService.findAll();
        model.addAttribute("notes", notes);
        return "index";
    }

    /**
     * Удаление заметки.
     * @param id id удаляемой заметки.
     * @return шаблон со списком заметок.
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        Note note = noteService.deleteNoteById(id);
        return "redirect:/noteList";
    }

    /**
     * Получение данных обновляемой заметки.
     * @param id id обновляемой заметки.
     * @param model объект модели для шаблонизатора.
     * @return шаблон с данными обновляемой заметки.
     */
    @RequestMapping("/updateNote/{id}")
    public String updateNoteByID(@PathVariable("id") int id, Model model){
        Note note = noteService.findNoteById(id);    ;
        model.addAttribute("note", note);
        return "update";
    }

    /**
     * Обновление заметки
     * @param model объект модели для шаблонизатора.
     * @param note объект обновленной заметки.
     * @return шаблон со списком заметок.
     */
    @RequestMapping("/noteUpdate")
    public String noteUpdate(Model model, Note note){
        Note nt = noteService.updateNoteById(note.getId(),  note);
        return "redirect:/noteList";
    }

}
