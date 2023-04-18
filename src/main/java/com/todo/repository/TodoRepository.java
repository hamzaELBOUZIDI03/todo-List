package com.todo.repository;

import com.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("todoRepo")
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

    TodoEntity findTodoByTask(String task);

}
