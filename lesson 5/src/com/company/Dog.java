package com.company;

// класс Dog наследует класс Animal
// свойства/методы родителя
// public - метод наследуется
// private - метод не наследуется
// protected - метод наследуется
public class Dog extends Animal {
    public String breed; // порода

    public void bark() {
        System.out.println("haw-haw");
    }

    @Override
    public void sleep (int h) {
        System.out.print("dog sleep ");
        System.out.print(h);
        System.out.println(" hours");
    }

    @Override
    public void eat() {
        super .eat(); // super - указатель на обьект родителя
        System.out.println("dog is not hungry anymore");
    }
}
