package com.example.backendTodo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TodoController {

    // Define API Contract (API endpoint)
    @GetMapping("/todos")
    public String todo() {
        return "Hello World";
    }
}
