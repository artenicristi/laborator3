package com.company;

public abstract class Account implements Messenger {

    private String username;
    private String password;
    private long id;

    public Account(String username, String password, long id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this)
            return true;
        if (obj == null)
            return false;

        return this.getId() == ((Account)obj).getId();
    }

    public void changeUsername(String username){
        this.username = username;
    }

    public void changePassword(String oldPassword, String newPassword){

        if (oldPassword.equals(this.password) && newPassword.length() > 0) {
            System.out.println("Password successfully changed");
            this.password = newPassword;
            return;
        }

        System.out.println("Failed to change password");
    }

    public abstract void printStatus();
}
