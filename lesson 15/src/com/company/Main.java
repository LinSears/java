package com.company;

public class Main {

    public static void main(String[] args) {
	// $ git clone https://github.com/J31019/todolist.git
    // после сделать свою ветку
    // git branch выводит все ветки
    // git branch hw/basenko создаем свою ветку с домашкой
    // после обязательно переключиться на свою ветку!!!
    // $ git checkout hw/basenko
    // далее создаем новый проект в интелидж идеа, и после сохраняем его в папку, куда изначально загружали домашку
    // /d/vadimB/todolist
    // $ git add -A
    // $ git commit -m"changes"
    // $ git push origin hw/basenko
    // получение инфы с Гита, что мы делаем что-то на другом компе
    // делаем такую же папку на другом компе, далее делаем такие же действия, как и с предыдущ папкой
    // чтобы синхронизировать 2 папки нужно набрать на новом компе
    // git fetch --all
    // git branch, если не показывает, то git branch -a
    // после гит чекаут, и пишем свою ветку
    // чтобы скопировать и код, который в папках, нужно git pull origin hw/basenko
        long t = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i) * Math.hypot(i, 100);
        }
        System.out.println(System.currentTimeMillis() - t);

        //
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500000; i++) {
                    double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i) * Math.hypot(i, 100);
                }
            }
        };
        Thread t1 = new Thread(r);
        MyThread t2 = new MyThread();
        t = System.currentTimeMillis();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - t);

        MyClass m = new MyClass();
        Thread tt1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    m.calc(1);
                    m.calc2(1, "A");
                }
            }
        });
        Thread tt2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    m.calc(-1);
                    m.calc2(-1, "-A");
                }
            }
        });
        tt1.start();
        tt2.start();

        try {
            tt1.join();
            tt2.join();
        }
        catch (Exception e) {}
        System.out.println(m.value);
        System.out.println(m.value2);
    }
}
