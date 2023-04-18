package com.todo.mapper;

import com.todo.dto.TodoDto;
import com.todo.entity.TodoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface TodoMapper {

    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);

   /* @Mapping(target = "id" , source = "id")
    @Mapping(target = "task" , source = "task")
    @Mapping(target = "date" , source = "date")
    @Mapping(target = "done" , source = "done")*/
    TodoDto convertToDto(TodoEntity entity);

   /* @Mapping(target = "id" , source = "id")
    @Mapping(target = "task" , source = "task")
    @Mapping(target = "date" , source = "date")
    @Mapping(target = "done" , source = "done")*/
    TodoEntity toEntity(TodoDto dto);

   /* @Mapping(target = "id" , source = "id")
    @Mapping(target = "task" , source = "task")
    @Mapping(target = "date" , source = "date")
    @Mapping(target = "done" , source = "done")*/
    List<TodoDto> convertToDTOS(List<TodoEntity> entities);

    /*@Mapping(target = "id" , source = "id")
    @Mapping(target = "task" , source = "task")
    @Mapping(target = "date" , source = "date")
    @Mapping(target = "done" , source = "done")*/
    List<TodoEntity> toEntities(List<TodoDto> dtos);

    //ptional<TodoDto> convertToDto2(Integer id);

    default Optional<TodoDto> convertToDto2(Optional<TodoEntity> todo) {
        return todo.map(this::convertToDto);
    }
}
