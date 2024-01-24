package com.example.Spring_HW4.repository;

import com.example.Spring_HW4.models.Note;
import com.example.Spring_HW4.models.SQLProp;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class NoteRepository {
    /**
     * Объект коннектора к бд.
     */
    private final JdbcTemplate jdbc;

    /**
     * Объект с запросами к бд.
     */
    private final SQLProp sqlProp;


    /**
     * Метод сохранение заметки в бд.
     * @param note Объект заметки.
     * @return Сохраненную заметку.
     */
    public Note save(Note note) {
        jdbc.update(sqlProp.getSave(), note.getTitle(), note.getDescription());
        return note;
    }

    /**
     * Получение всех заметок из бд.
     * @return Список заметок.
     */
    public List<Note> findAll() {
        return jdbc.query(sqlProp.getFindAll(), (r, i) -> {
            Note note = new Note();
            note.setId(r.getInt("id"));
            note.setTitle(r.getString("title"));
            note.setDescription(r.getString("description"));
            return note;
        });
    }

    /**
     * Получение одной заметки по ID
     * @param id Идентификатор заметки.
     * @return Заметку.
     */
    public Note findNoteById(int id) {
        return jdbc.queryForObject(sqlProp.getFindOneById(),
                (r, i) -> {
                    Note note = new Note();
                    note.setId(r.getInt("id"));
                    note.setTitle(r.getString("title"));
                    note.setDescription(r.getString("description"));
                    return note;
                }, id);
    }

    /**
     * Обновление заметки по ID
     * @param id Идентификатор заметки.
     * @param note Объект заметки.
     * @return Обновленную заметку.
     */
    public Note updateNoteById(int id, Note note){
        jdbc.update(sqlProp.getUpdateById(), note.getTitle(), note.getDescription(), note.getId());
        return note;
    }

    /**
     * Удаление заметки по ID
     * @param id Идентификатор заметки.
     * @return Удаленную заметку.
     */
    public Note deleteNoteById(int id) {
        Note note = findNoteById(id);
        jdbc.update(sqlProp.getDeleteById(), id);
        return note;
    }
}
