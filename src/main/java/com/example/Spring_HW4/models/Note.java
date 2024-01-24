package com.example.Spring_HW4.models;

import lombok.Data;

@Data
public class Note {
    /**
     * id заметки.
     */
    private  int id;
    /**
     * Заголовок заметки.
     */
    private String title;
    /**
     * Описание заметки.
     */
    private String description;
}
