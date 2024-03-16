package com.example.viiko_9;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage instance = null;

    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void listUsers() {
        for (User user : UserStorage.getInstance().getUsers()) {
            System.out.println(user); // Assuming User class has a meaningful toString() method
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
