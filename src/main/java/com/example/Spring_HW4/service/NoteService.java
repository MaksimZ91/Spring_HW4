package com.example.Spring_HW4.service;

import com.example.Spring_HW4.models.Note;
import com.example.Spring_HW4.repository.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteService {

    /**
     * Объект репозитория.
     */
    private final NoteRepository noteRepository;

    /**
     * Получение всех заметок.
     * @return Список заметок.
     */
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    /**
     * Получение заметки по ID
     * @param id Идентификатор заметки.
     * @return Найденную заметку.
     */
    public Note findNoteById(int id) {
        return noteRepository.findNoteById(id);
    }

    /**
     * Удалеение заметки по ID
     * @param id Идентификатор заметки.
     * @return Удаленную заметку.
     */
    public Note deleteNoteById(int id) {
        return noteRepository.deleteNoteById(id);
    }

    /**
     * Обновление заметки по ID
     * @param id Идентификатор заметки.
     * @param note Объект заметки.
     * @return Обновленную заметку.
     */
    public Note updateNoteById(int id, Note note) {
        return noteRepository.updateNoteById(id, note);
    }

    /**
     * Сохранение заметки.
     * @param note Объект заметки.
     * @return Сохраненную заметку.
     */
    public Note save(Note note) {
        return noteRepository.save(note);
    }

}
