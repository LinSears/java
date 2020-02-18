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
                Thread ct = Thread.currentThread();
                synchronized (ct) {
                    try {
                        ct.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 100000; i++) {
                        m.calc(1);
                        m.calc2(1, "A");
                    }
                }
            }
        });
        Thread tt2 = new Thread(new Runnable(){
            @Override
            public void run() {
                Thread ct = Thread.currentThread();
                System.out.println(ct.getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\n" + ct.getName() + "Wake up\n");
                for (int i = 0; i < 100000; i++) {
                    if (i == 1000) {
                        synchronized (tt1) {
                            System.out.println("\n" + tt1.getState());
                            tt1.notifyAll();
                            }
                        }
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

        // currentThread - возвращает обьект текущего потока
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName());
        // sleep - останавливает работу потока на заданное время
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // wait - приостанавливает работу потока до наступления события о пробуждении
        try {
            // ct.wait(); // в основном потоке никогда не вызывать
        } catch (Exception e) {
            e.printStackTrace();
        }
        // notify, notifyAll - создают для потока событие, чтобы тот продолжил работу
        //ct.notify();
        // getState - возвращает текущее состояние потока
        System.out.println(ct.getState());
        // interrupt - прерывает выполнение потока
        ct.interrupt();
        Thread.yield(); // завершает квант работы текущего потока и переключается на следующий
        // ct.setPriority(); - устанавливает приоритет потока

    }
}
