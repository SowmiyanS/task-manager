package org.sowmin.dto;

import org.sowmin.entity.TaskStatusEnum;

import java.util.Date;

public record UpdateTaskInput(TaskStatusEnum status, Date dueDate) {

}
