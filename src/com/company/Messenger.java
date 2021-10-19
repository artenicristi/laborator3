package com.company;

public interface Messenger {

    void sendMessage(Account sendTo, String message);
    void receiveMessage(Account receivedFrom, String message);
}
