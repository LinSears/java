package com.company;

public class Main2 {

    public static void main(String[] args) {
        // бинарные операторы
        // & - бинароное и
        System.out.println(5 & 7);
        // | - бинарное или
        System.out.println(5 | 7);
        // >> - бинарный сдвиг вправо
        System.out.println(7 >> 2);
        // << - бинарный сдвиг влево
        System.out.println(5 << 3);
        // пример
        // 4 первых бита - скорость (13)
        // 5-7 - напряжение (4)
        // 8-11 - сила тока (9)
        // 1001 100 1101 = 1229
        int data = 1229;
        // 1 вариант
        int speed = data << 27;
        speed = speed >> 27;
        System.out.println(speed);
        // 2 вариант
        int maskSpeed = 15; // 0000 000 1111
        speed = data & maskSpeed;
        System.out.println(speed);
        // напряжение
        int maskVoltage = 112; //0000 111 0000
        int Voltage = (data & maskVoltage) >> 4;
        System.out.println(Voltage);
        // сила тока
        int current = data >> 7;
        System.out.println(current);


    }
}
