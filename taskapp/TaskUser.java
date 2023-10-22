/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskapp;

/**
 *
 * @author felis
 */
public class TaskUser implements TaskObserver{

    private String name;

    public TaskUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println("User " + name + ": Task completed - " + task.getDescription());
    }
    
}
