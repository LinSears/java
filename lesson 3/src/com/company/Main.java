package com.company;

public class Main {

    public static void main(String[] args) {
	// массивы, начинается с 0
    int []arr = new int[5];
    arr[0] = 10;
    arr[4] = 20;
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);
    // недопустимая операция
    //arr[5] = 12;
    // двумерные массивы, 3 строки, 4 столбца
    int [][]m = new int[3][4];
    m[0][1] = 12;
    m[2][3] = 22;
    System.out.println(m[0][1]);
    System.out.println(m[2][3]);
    System.out.println(m[0][0]);
    // определение длины массива
    System.out.println(arr.length);
    System.out.println(m[0].length);
    //статическая инициализация массива
    int[] arr2 = {1,2,4,7,-45,78};
    System.out.println(arr2[3]);
    int[][]m2 = {{1,2,2}, {3,4,4}, {5,6,6}};
    System.out.println(m2[1][2]);

    // циклы
        int i = 0;
        while (i < 5) {
        System.out.println("hello");
        i = i + 1;
        }
        // i = 5, do while это цикл с постпроверкой условия
        do {
        System.out.println("world");
        }   while (i < 5);
        // 1 блок - блок инициализации
        // 2 блок - блок условия выполнения
        // 3 блок - блок поствыполнения
        // любой блок может быть пустым(или может отсутствовать)
        for (int k = 0;k < 4;k = k + 1) {
        System.out.println(k);
        }
        // for (;;) - бесконечный цикл
        // оператор break
        for (int k = 0;;k = k + 1 ) {
            System.out.println("hi");
            if (k == 7) {
                break; // завершает выполнение цикла
            }
        }
        // оператор continue
        for (int k = 0; k < 10; k = k +1) {
            if (k % 2 != 0) {
                continue; // завершает текущую итерацию цикла
            }
            System.out.println(k);
        }
        // обход элементов массива
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr [j]);
        }
        // операторы ++ и --
        int t = 7;
        t++; // t = t + 1 - увеличивает значение переменной на 1
        System.out.println(t);
        t--; // t = t - 1 - уменьшает значение переменной на 1
        System.out.println(t);
        int c = t++;
        System.out.println(c);
        // таблица умножения
        for (int n = 1; n < 10; n++) {
            for (int k = 1; k <=9; k++) {
                System.out.print(n);
                System.out.print("*");
                System.out.print(k);
                System.out.print("=");
                System.out.println(n * k);
            }
            System.out.println();
        }
    }
}
