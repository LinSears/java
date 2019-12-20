package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;
    private int nCount;

    public Game() {
        // генерация случайных чисел
        // Первый способ
        // double r = Math.random(); // от нуля до единицы, причем сама единица не включается
        // r * (max - min) + min; [min,max]
        // Пример:      int h = 40 * r + 10;
        // Второй способ
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число:");
            int user;
            try {
                user = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Введите корректное число!");
                sc = new Scanner(System.in);
                continue;
            }
            this.nCount++;
            if (this.number == user) {
                System.out.println("Поздравляем!");
                System.out.print("Вы угадали число за ");
                System.out.print(this.nCount);
                System.out.println(" попыток");
                break;
            }
            if (this.number > user) {
                System.out.println("Больше");
            }
            if (this.number < user) {
                System.out.println("Меньше");
            }
        }
    }
}
