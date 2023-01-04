package com.example.todo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@AllArgsContructor
@NoArgsConstructor
@Entity
@Table(name = "To-do")
public class Task {

    @Id
    @GeneratedValue
    private int id;
    private String description;
}
