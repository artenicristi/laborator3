package com.company;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("User1", "pass1", 1, "football");
        User user2 = new User("User2", "pass2", 2, "basketball");
        User user3 = new User("User3", "pass3", 3, "volleyball");
        User user4 = new User("User4", "pass4", 4, "gaming");

        Admin admin1 = new Admin("Admin1", "12345", 999);
        Admin admin2 = new Admin("Admin2", "54321", 100);
        Admin admin3 = new Admin("Admin3", "99999", 555);

        admin1.addAccount(user1);
        admin1.addAccount(user2);
        admin1.addAccount(user1);
        admin1.addAccount(admin2);
        admin1.addAccount(admin2);
        admin1.addAccount(admin3);

        System.out.println("-------------------------------------------------------");

        admin1.getList().forEach(account -> {
            account.printStatus();
            admin1.sendMessage(account, "Hello");
        });
    }
}
