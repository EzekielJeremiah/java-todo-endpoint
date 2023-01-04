package com.example.todo.controller;



@Entity
@Table(name = "todo")
public class model {
    private int id;
    private String description;

    public model(int id, String description){
        this.id = id;
        this.description = description;
    }

    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    public int getId() {
        return id;
    }
}
