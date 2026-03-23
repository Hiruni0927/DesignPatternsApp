/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsapp;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {

        Channel channel = new Channel();

        User u1 = UserFactory.createUser("Alice");
        User u2 = UserFactory.createUser("Bob");

        channel.subscribe(u1);
        channel.subscribe(u2);

        channel.notifyUsers("New Video Uploaded!");
    }
}
