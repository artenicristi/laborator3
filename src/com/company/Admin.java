package com.company;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Account {

    private List<Account> list;

    public Admin(String username, String password, long id) {
        super(username, password, id);
        this.list = new ArrayList<>();
    }

    public List<Account> getList() {
        return new ArrayList<>(list);
    }

    @Override
    public void printStatus() {
        System.out.println("Admin class -> " +
                "adminName: " + getUsername());
    }

    @Override
    public void sendMessage(Account sendTo, String message) {
        System.out.println("Send message from Admin: " + getUsername());
        sendTo.receiveMessage(this, message);
    }

    @Override
    public void receiveMessage(Account receivedFrom, String message) {
        System.out.println("Received message in Admin: " + getUsername() + " from " + receivedFrom.getUsername());
        System.out.println("The message is: " + message + "\n");
    }

    public boolean addAccount(Account account) {

        if (!list.contains(account)) {
            System.out.println(account.getUsername() + " added to the list");
            list.add(account);
            return true;
        }

        System.out.println("Failed to add " + account.getUsername() + " to the list");
        return false;
    }

    public boolean removeAccount(Account account) {

        boolean action = list.remove(account);

        if (action)
            System.out.println(account.getUsername() + " removed from list");
        else
            System.out.println("Failed to remove " + account.getUsername() + " from the list");

        return action;
    }

    public void printList() {
        System.out.print(getUsername() + " list of accounts : ");
        list.forEach(user -> System.out.print(user.getUsername() + " "));
        System.out.println();
    }
}
