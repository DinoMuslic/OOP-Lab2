package org.example.task_item;

import org.example.enums.Status;

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status status;
    public TaskItem(int taskId, String taskDescription, Status status) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}
