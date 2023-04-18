package com.todo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class TodoDto {
    @JsonProperty("id")
    private Integer id;
    private String task;
    private String description;
    private LocalDate date;
    private boolean done;

    public TodoDto() {
    }

    public TodoDto(Integer id, String task, String description, LocalDate date, boolean done) {
        this.id = id;
        this.task = task;
        this.description = description;
        this.date = date;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", done=" + done +
                '}';
    }
}

