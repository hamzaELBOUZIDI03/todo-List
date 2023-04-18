package com.todo.entity;

import sun.util.resources.LocaleData;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "todo")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "task")
    private String task;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "done")
    private boolean done;


    public TodoEntity() {
    }

    public TodoEntity(Integer id, String task, String description, LocalDate date, boolean done) {
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
        return "TodoEntity{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", done=" + done +
                '}';
    }
}
