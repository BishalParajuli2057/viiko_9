package com.example.viiko_9;

import java.util.ArrayList;

public class UserStorage {
    private final ArrayList<User>users;
    private static  UserStorage file = new UserStorage();
    private  UserStorage(){
        users=new ArrayList<>();
    }
    public static UserStorage file(){
        if (file == null){
            file = new UserStorage();
        }
        return file;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(int id) {
        users.remove(id);
    }
    public ArrayList<User> getUsers() {
        return users;
    }


}