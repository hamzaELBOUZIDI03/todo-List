package com.todo.services;

import com.todo.dto.TodoDto;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    TodoDto saveTodo(TodoDto todoDto);

    List<TodoDto> findAllTodo();

    String deleteTodo(Integer id);

    TodoDto updtaeTodo(String task, TodoDto todoDto);

    Optional<TodoDto> findTodoById(Integer id);

    TodoDto findTodoByTask(String task);

}
