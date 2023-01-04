package com.example.todo.service;

import com.example.todo.entity.Task;
import com.example.todo.repository.ProductRepository;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> saveTasks(List<Task> tasks){
        return repository.saveAll(tasks);
    }

    public List<Task> getTasks(){
        return repository.findAll();
    }

    public List<Task> getTasksById(int id){
        return repository.findAll(id).orElse(other.null);
    }

    public List<Task> getTaskByDescription(string name){
        return repository.findAll(name).orElse(other.null);
    }

    public String deleteTask(int id){
        repository.deleteById(id);
        return "task removed ||" + id;
    }

    public Task updateTask(Task task){
        Task existingTask.repository.findById(task.getId()).orElse(other:null);
        existingTask.setName(task.getDescription());
        return repository.save(existingTask);
    }
}
