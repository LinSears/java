// Реализация ES6 в JavaScript
// let, const

// лямбда выражения(стрелочные функции)

// агрументы со значением по умолчанию
// function some(a, b=12, c="hello") {...}

// оператор ...(троеточие)
function test1(a, b, c) {
    console.log(a, b, c);
}
let arr = [10, 30, 40];
test1(...arr); // 10, 30, 40

function test2(...arr) {
    console.log(arr);
}
test2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// упрощение синтаксиса при работе с обьектами
function createCar(name, color, weight) {
    return {
        name,       // name: name
        color,      // color: color
        weight,     // weight: weight
        drive() {}, // drive: function() {}
        // вычисляемое свойство
        [color + '_color']: 'test'
    }
}
let car = createCar('BMW', 'red', '1500');
console.log(car);

// Восьмеричная и двоичная форма записи числа
// 8
let a = 0o23; // 8
console.log(a);
let b = 0b0101010;
console.log(b);

// деструктуризация массивов и обьектов
function test3() {
    return [1, 2, 3];
}
let d = test3();
console.log(d);
// деструктуризация массива
let [x, y, z] = test3();
console.log(x, y, z);

function test4() {
    return {
        color: 'red',
        name: 'Vasya',
        age: 13
    }
}
// деструктуризация обьекта
let {color: a1, age: b1, name: c1} = test4();
console.log(a1, b1, c1);

// ключевое слово super
let parent = {
    say() {
        console.log("Hello from parent");
    }
}
let child = {
    say() {
        super.say();
        console.log('Hello from child');
    }
}
child.__proto__ = parent;
child.say();

// Форматирование строк
let name = 'Vasya';
let str = `My name is ${name}`;
console.log(str);

// Классы
class Animal {
    constructor(age) {
        this.age = age;
    }

    setColor(color) {
        this.color = color;
    }

    getColor() {
        return this.color;
    }
    static info() {
        console.log('This class is Animal');
    }
}
let animal = new Animal(10);
animal.setColor('yellow');
console.log(animal.getColor());
Animal.info();

// Наследование классов
class Dog extends Animal {
    constructor(age, weight) {
        // вызов конструктора родителя обязателен в переопределенном конструкторе потомка
        super(age);
        this.weight = weight;
    }
}
let dog = new Dog(10, 30);
console.log(dog);

// typeof - оператор, который возвращает тип обьекта
console.log(typeof Animal);

// Итераторы
let arr2 = [10, 20, 30];
// обьявляем итератор для прохождения по всем элементам массива
let it = arr2[Symbol.iterator]();
console.log(it.next());
console.log(it.next());
console.log(it.next());
console.log(it.next());

//  Генераторы
// * = нужна для того, чтобы обозначить функцию в качестве генератора
function* gen() {
    let i = 0;
    while(i < 5) {
        yield i++;
    }
}
// создаем обьект-генератор
let g = gen();
console.log(g.next());
console.log(g.next());
console.log(g.next());
console.log(g.next());
console.log(g.next());
console.log(g.next());

// Промисы (promise)
let p = new Promise(function(resolve, reject) {
    if (true) {
        resolve('all ok');
    } else {
        reject("error");
    }
});
p.then(   // либо функции, либо лямбда
    // сработает в случае, еслы была вызвана функция resolve
    (val) => val + "!",
    // сработает в случае, еслы была вызвана функция reject
    (err) => alert(err)
)
// в случае, если в методе then сработает обработчик функций resolve, то можно еще раз вызвать метод then,
// в котором автоматически сработает метод resolve с тем значением, которое было передано из предыдущего вызова обработчика функции resolve
.then(
    (val) => val.toUpperCase()
)
.then(
    (val) => console.log(val)
)

///////////////////////////////////////
// Событийная система
function startTimer(interval) {
    setTimeout(() => alert('Timer is finished!'), interval);
}