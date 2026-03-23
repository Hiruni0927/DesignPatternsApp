/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsapp;

/**
 *
 * @author user
 */
public class UserFactory {
    public static User createUser(String name) {
        return new User(name);
    }
}
