package com.todo.services;

import com.todo.dto.TodoDto;
import com.todo.mapper.TodoMapper;
import com.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service("todoService")
public class TodoServiceImpl implements TodoService{

    @Autowired
    @Qualifier("todoRepo")
    private TodoRepository todoRepo;

    @Autowired
    private TodoMapper todoMapper;



    @Override
    public TodoDto saveTodo(TodoDto Dto) {
        return todoMapper.convertToDto(todoRepo.save(todoMapper.toEntity(Dto)));
    }

    @Override
    public List<TodoDto> findAllTodo() {
        return todoMapper.convertToDTOS(todoRepo.findAll());
    }

    @Override
    public String deleteTodo(Integer id) {
        if(todoRepo.existsById(id)) {
            todoRepo.deleteById(id);
            return ("delete with successful");
        }
        else {
            throw new EntityNotFoundException("Todo not found with id: " + id);
        }

    }

    @Override
    public TodoDto updtaeTodo(String task, TodoDto dto) {
        return todoMapper.convertToDto(todoRepo.save(todoMapper.toEntity(dto)));
    }

    @Override
    public TodoDto findTodoByTask(String task) {
        return todoMapper.convertToDto(todoRepo.findTodoByTask(task));
    }

    @Override
    public Optional<TodoDto> findTodoById(Integer id) {
        return todoMapper.convertToDto2(todoRepo.findById(id));
    }

}

