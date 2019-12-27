package com.company;

public class Main {

    public static void main(String[] args) {
        /*Animal animal = new Animal("white", 10); // посте того как закомментировали конструктор с параметрами
        System.out.println(animal.color);                   // у нас больше нет конструктора. Присваиваем значение тут
        System.out.println(animal.age);
        Animal animal2 = new Animal( "red", 15);
        System.out.println(animal2.color);
        System.out.println(animal2.age); */
        Dog dog = new Dog();
        Dog.footCount = 4; // обращение к статическим полям класса осущ через название класса
        System.out.println(dog.footCount);
        System.out.println(dog.color);
        Dog dog2 = new Dog("blue", 6, "Rex");
        System.out.println(dog2.footCount);
        System.out.println(dog2.color);
        System.out.println(dog2.age);
        System.out.println(dog2.name);
        dog2.say("aw-aw");

        Dog.Cat cat = new Dog.Cat();
        cat.name = "Rainbow";
        dog.bark();
        Dog.bark(); // правильный
    }
}
