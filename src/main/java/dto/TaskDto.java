package com.example.taskmanager.dto;

import com.example.taskmanager.model.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TaskDto {

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    private TaskStatus status;
}