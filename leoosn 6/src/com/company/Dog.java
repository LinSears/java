package com.company;

public class Dog extends Animal {
    public String name;
    //Статические свойства располагаются в памяти в единственном экземпляре

    public static int footCount;


    public Dog() {

        super("green", 5); // поскольку нет родителя, создаем его снова(задаем параметры)
        this.name = "sad"; // пишется только после Супер
        Cat cat = new Cat();

    }

    public Dog(String color, int age, String name) {
        super(color, age);
        this.name = name;

    }

    // say - определение родительского абстрактного метода say
    public void say(String sound) {
        System.out.println("haw-haw " + sound);
    }

    // внутренний класс(inner-класс)
    public static class Cat { //без Статик он доступен только в этом методе
        public String name;

        Cat() {
            this.name = "I am a Cat"; //прежде чем писать this, надо обьявить имя(зарезерв для него память)
            name = "I am a Dog";

        }
    }

    private class Mouse {
        Mouse() {
            name = "I am a Mouse";
        }
    }

    public static void bark() {
        System.out.println("bark");
        // для статических методов нельзя использовать ссылку на экземпляр обьекта (this)
        // this.name = "asd"; - ошибка
        sleep();
    }

    public static void sleep() {
        System.out.println("z-z-z-z-z");
    }



}
