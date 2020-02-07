package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // FILO - First in, last out
        Stack<String> stack = new Stack<>();
        // add - добавляет элемент в стэк
        stack.add("element 1");
        stack.add("element 2");
        stack.add("element 3");
        System.out.println(stack);
        // pop - достает "верхний" элемент стека
        System.out.println(stack.pop());
        System.out.println("стек после вызова метода рор");
        System.out.println(stack);

        stack.push("element 4");
        System.out.println("стек после добавления элемента (push)");
        System.out.println(stack);
        // реек - возвращает верхний элемент стека без его удаления
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.print("Элемент \"element 2\" находится по номеру: ");
        System.out.println(stack.search("element 2"));

        // удаляем все элементы из стека
        stack.clear();
        try {
            System.out.println(stack.pop());
        }
        catch (EmptyStackException e) {
            System.out.println("Ошибка! Стек пустой");
        }

        // FIFO - first in, first out
        Queue<String> queue = new PriorityQueue<>(3);
        queue.add("q1");
        queue.add("q2");
        queue.add("q3");
        System.out.println(queue);
        // poll, remove - достает и удаляет первый элемент в очереди
        System.out.println(queue.poll());
        System.out.println(queue);
        // peek, element - возвращает первый элемент в очереди без удаления
        System.out.println(queue.peek());
        if (queue.offer("q4")) {
            System.out.println("Элемент добавлен");
        } else {
            System.out.println("Не удалось добавить элемент");
        }

        UserComparator comparator = new UserComparator();
        Queue<User> users = new PriorityQueue<>(comparator);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setMoney(rand.nextInt(1000));
            users.add(u);
        }
        while(true) {
            User u = users.poll();
            if (u == null) {
                break;
            }
            System.out.println(u);
        }

        System.out.println(fact1(15));
        System.out.println(fact1(16));
        System.out.println(fact2(5));
    }


    // 5! = 1*2*3*4*5
    // 0! = 1
    // находим факториал
    public static int fact1(int n) {
        int f = 1;
        for (;n != 1; n--) {
            f *= n; // f = f * n
        }
        return f;
    }

    // 5! = 5 * 4!  рекурсия
    public static int fact2(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact2(n-1);
    }
}
