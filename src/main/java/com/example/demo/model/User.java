package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "User")
@Accessors(chain = true)
public class User {

    @Id
    private String id;

    private String email;
    private String password;
    private List<Todo> todos;

}
