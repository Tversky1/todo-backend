package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping("/get")
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping("/post")
    public Todo saveTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }


}
