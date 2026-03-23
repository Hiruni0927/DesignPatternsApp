/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsapp;

/**
 *
 * @author user
 */
import java.util.*;

public class Channel {
    private List<Observer> users = new ArrayList<>();

    public void subscribe(Observer user) {
        users.add(user);
    }

    public void notifyUsers(String message) {
        for (Observer user : users) {
            user.update(message);
        }
    }
}