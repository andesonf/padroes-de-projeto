/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.taskapp;

/**
 *
 * @author felis
 */
public interface Command {
     void execute();
}
public class AddTaskCommand implements Command {
    private TaskList taskList;
    private Task task;

    public AddTaskCommand(TaskList taskList, Task task) {
        this.taskList = taskList;
        this.task = task;
    }

    @Override
    public void execute() {
        taskList.addTask(task);
    }
}