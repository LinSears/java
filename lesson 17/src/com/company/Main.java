package com.company;

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

    }
}
