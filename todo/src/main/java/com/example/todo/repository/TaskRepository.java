package com.example.todo.repository;

import com.example.todo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Task,Integer> {
}
