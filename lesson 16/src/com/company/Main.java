package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // сериализация
        User u = new User("Vasya", 20);
        u.height = 120.0f;
        try {
            FileOutputStream fos = new FileOutputStream("user.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(u);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // десериализация
        try {
            FileInputStream fis = new FileInputStream("user.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User user = (User)ois.readObject();
            ois.close();
            fis.close();
            System.out.print(user.name);
            System.out.println(user.age);
            System.out.println(user.height); // ничего не сериализовалось
        } catch (Exception e) {
            e.printStackTrace();
        }

        // сериализация коллекций
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Misha", 12));
        users.add(new User("Masha", 13));
        users.add(new User("Grisha", 25));
        try {
            FileOutputStream fos = new FileOutputStream("users.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // дессериализация коллекций
        try {
            FileInputStream fis = new FileInputStream("users.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<User> people = (ArrayList<User>)ois.readObject();
            ois.close();
            fis.close();
            for (User user : people) {
                System.out.print(user.name);
                System.out.println(user.age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// скачать дома android студио
