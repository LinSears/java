package com.company;

// в java невозможно создать экземпляр обьекта
// абстрактного класса!
public abstract class Animal {  //aбстрактек тут
    public String color;
    public int age;

    /*public Animal() {  //public обязательно (конструктор)
        color = "black";
        age = 1;
        System.out.println("animal was created");
    } */

    public Animal(String color, int age) { //перегружаем конструктор
        this.color = color; // this ссылка на текущий экземпляр обьекта
        this.color = color;
        this.age = age;

    }

    public abstract void say(String word);   // если метод абстрактный, то и класс(в самом верху) тоже должен быть абстрактным!




}
