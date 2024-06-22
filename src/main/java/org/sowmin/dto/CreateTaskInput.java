package org.sowmin.dto;

import org.sowmin.entity.Task;
import org.sowmin.entity.TaskStatusEnum;

import java.util.Date;

public record CreateTaskInput(String name, String description, TaskStatusEnum status, Date dueDate) {
    public Task toTask() {
        Task task = new Task();

        task.setName(name)
                .setDescription(description)
                .setStatus(status)
                .setDueDate(dueDate);

        return task;
    }
}
