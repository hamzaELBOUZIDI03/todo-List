package com.todo.controllers;

import com.todo.dto.TodoDto;
import com.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    @Qualifier("todoService")
    private TodoService todoService;

    @PostMapping("/save-Todo")
    public TodoDto saveTodo(@RequestBody TodoDto Dto) {
        return this.todoService.saveTodo(Dto);
    }

    @GetMapping("/findAll-todo")
    public List<TodoDto> findAllTodo() {
        return this.todoService.findAllTodo();
    }

    @DeleteMapping("/delete-todoById")
    public String deleteTodo(@RequestParam Integer id) {
        return  this.todoService.deleteTodo(id);
    }

    @PutMapping("/update-todo/{task}")
    public TodoDto updtaeTodo(@PathVariable String task, @RequestBody TodoDto dto) {
        return this.todoService.updtaeTodo(task, dto);
    }

    @GetMapping("/findBy-task")
    public TodoDto findTodoByTask(@RequestParam String task) {
        return this.todoService.findTodoByTask(task);
    }

    @GetMapping("/find-todoById")
    public Optional<TodoDto> findTodoById(@RequestParam Integer id) {
        return this.todoService.findTodoById(id);
    };

}
