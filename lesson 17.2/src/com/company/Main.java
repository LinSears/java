package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            int d = Integer.parseInt(arg);
            sum += d;
        }
        System.out.print("Сумма чисел = ");
        System.out.println(sum);
        // проджект структура, билд джар,
        // D:\vadimB\lesson 17\out\artifacts\app>java -jar app.jar 1 2 3 4

        // системные переменные
        // getenv - возвращает список системных переменных
        Map<String, String> envs = System.getenv();
        System.out.println("JAVA_HOME = " + envs.get("Path"));
        System.out.println(System.getenv("TEMP"));
        //C:\Users\Admin>java -jar tail.jar 1.txt
    }
}
