package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "todo")
@Accessors(chain = true)
public class Todo {

    @Id
    private String todoId;
    private String todoContext;
    private boolean isCompleted;    





}
