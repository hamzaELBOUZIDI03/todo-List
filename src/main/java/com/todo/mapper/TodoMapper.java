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

    TodoDto convertToDto(TodoEntity entity);

    TodoEntity toEntity(TodoDto dto);

    List<TodoDto> convertToDTOS(List<TodoEntity> entities);

    List<TodoEntity> toEntities(List<TodoDto> dtos);

    default Optional<TodoDto> convertToDto2(Optional<TodoEntity> todo) {
        return todo.map(this::convertToDto);
    }
}
