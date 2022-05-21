package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {
    @GetMapping //@RequestMapping(method = RequestMethod.GET, value = "")
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @GetMapping
    public TaskDto getTask(Long taskId) {
        return new TaskDto(1L, "a", "a");
    }

    @DeleteMapping
    public void deleteTask (Long taskId) {

    }

    @PostMapping
    public TaskDto updateTask (TaskDto taskDto) {
        return new TaskDto(1L, "b", "b");
    }

    @PutMapping
    public void createTask (TaskDto task) {

    }
}
