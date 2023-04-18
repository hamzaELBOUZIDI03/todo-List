package com.todo.mapper;

import com.todo.dto.TodoDto;
import com.todo.entity.TodoEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-14T15:33:32+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_333 (Oracle Corporation)"
)
@Component
public class TodoMapperImpl implements TodoMapper {

    @Override
    public TodoDto convertToDto(TodoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TodoDto todoDto = new TodoDto();

        todoDto.setId( entity.getId() );
        todoDto.setTask( entity.getTask() );
        todoDto.setDescription( entity.getDescription() );
        todoDto.setDate( entity.getDate() );
        todoDto.setDone( entity.isDone() );

        return todoDto;
    }

    @Override
    public TodoEntity toEntity(TodoDto dto) {
        if ( dto == null ) {
            return null;
        }

        TodoEntity todoEntity = new TodoEntity();

        todoEntity.setId( dto.getId() );
        todoEntity.setTask( dto.getTask() );
        todoEntity.setDescription( dto.getDescription() );
        todoEntity.setDate( dto.getDate() );
        todoEntity.setDone( dto.isDone() );

        return todoEntity;
    }

    @Override
    public List<TodoDto> convertToDTOS(List<TodoEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TodoDto> list = new ArrayList<TodoDto>( entities.size() );
        for ( TodoEntity todoEntity : entities ) {
            list.add( convertToDto( todoEntity ) );
        }

        return list;
    }

    @Override
    public List<TodoEntity> toEntities(List<TodoDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<TodoEntity> list = new ArrayList<TodoEntity>( dtos.size() );
        for ( TodoDto todoDto : dtos ) {
            list.add( toEntity( todoDto ) );
        }

        return list;
    }
}
