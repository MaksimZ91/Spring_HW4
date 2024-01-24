package com.example.Spring_HW4.models;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="sql")
@Data
public class SQLProp {
    /**
     * Строка запроса на получение всех заметок.
     */
    private String findAll;
    /**
     * Строка запроса на сохранение заметки.
     */
    private String save;
    /**
     * Строка запроса на обновление заметки по ID.
     */
    private String  updateById;
    /**
     * Строка запроса на удаление заметки по ID.
     */
    private String deleteById;
    /**
     * Строка запроса на получение заметки по ID.
     */
    private String findOneById;
}
