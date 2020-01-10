//package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    User<String, String> u = new User<>();
	    User<Date, Object> u2 = new User<>();
	    u.id = "Some ID";
        System.out.println(u.id.toLowerCase());
        u2.id = new Date();
        System.out.println(u2.id.getTime());
        //
        Car<User> car = new Car<>();

        // коллекции
        /* рассмотрим arrayList (все элементы располагаются друг за другом, порядок их автоматически не меняется).
        Возможен случайный доступ к элементам*/
        ArrayList<String> list = new ArrayList<>();
        list.add("hello"); //метод add добавляет элемент в конец списка //изначально индекс 0
        list.add("world"); //индекс 1
        list.add(1, "Java");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // get = []
        }
        list.remove("hello");
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.remove(Integer.valueOf(20));
        System.out.println(list2);
    }
}
