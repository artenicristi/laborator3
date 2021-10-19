package com.company;

public class User extends Account {

    private String hobby;

    public User(String username, String password, long id, String hobby) {
        super(username, password, id);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void printStatus() {
        System.out.println("User class -> " +
                "username: " + this.getUsername());
    }

    @Override
    public void sendMessage(Account sendTo, String message) {
        System.out.println("Send message from User: " + getUsername());
        sendTo.receiveMessage(this, message);
    }

    @Override
    public void receiveMessage(Account receivedFrom, String message) {
        System.out.println("Received message in User: " + getUsername());
        System.out.println("The message is: " + message + "\n");
    }
}
