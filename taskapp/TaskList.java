/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felis
 */
public class TaskList {
     private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void completeTask(Task task) {
        task.complete();
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
