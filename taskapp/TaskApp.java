/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskapp;

/**
 *
 * @author felis
 */
public class TaskApp {

    public static void main(String[] args) {
                           
        TaskList taskList = new TaskList();
        TaskManager taskManager = new TaskManager();

        TaskObserver user1 = new TaskUser("Alice");
        TaskObserver user2 = new TaskUser("Bob");

        taskList.addObserver(user1);
        taskList.addObserver(user2);

        Task task1 = new Task("Do the laundry");
        Task task2 = new Task("Write a report");

        Command addTaskCommand = new AddTaskCommand(taskList, task1);
        taskManager.executeCommand(addTaskCommand);

        Command removeTaskCommand = new RemoveTaskCommand(taskList, task1);
        taskManager.executeCommand(removeTaskCommand);

        Command completeTaskCommand = new CompleteTaskCommand(taskList, task2);
        taskManager.executeCommand(completeTaskCommand);
                                        
    }
}
