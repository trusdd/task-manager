package com.example.taskmanager.controller;

import com.example.taskmanager.dto.TaskDto;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.security.JwtService;
import com.example.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;
    private final JwtService jwtService;

    @PostMapping
    public ResponseEntity<Task> createTask(@Valid @RequestBody TaskDto dto,
                                           @RequestHeader("Authorization") String authHeader) {
        String username = extractUsernameFromHeader(authHeader);
        Task task = taskService.createTask(username, dto);
        return ResponseEntity.ok(task);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(@RequestHeader("Authorization") String authHeader) {
        String username = extractUsernameFromHeader(authHeader);
        List<Task> tasks = taskService.getAllTasksByUser(username);
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id,
                                            @RequestHeader("Authorization") String authHeader) {
        String username = extractUsernameFromHeader(authHeader);
        Task task = taskService.getTaskById(id, username);
        return ResponseEntity.ok(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id,
                                           @Valid @RequestBody TaskDto dto,
                                           @RequestHeader("Authorization") String authHeader) {
        String username = extractUsernameFromHeader(authHeader);
        Task task = taskService.updateTask(id, username, dto);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id,
                                        @RequestHeader("Authorization") String authHeader) {
        String username = extractUsernameFromHeader(authHeader);
        taskService.deleteTask(id, username);
        return ResponseEntity.ok().build();
    }

    private String extractUsernameFromHeader(String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }
        String token = authHeader.substring(7);
        return jwtService.extractUsername(token);
    }
}