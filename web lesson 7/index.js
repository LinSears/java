console.log("Hello from js file");

/* Переменные и константы
Переменные задаются в js при помощи ключевых слов let и var.
Константы задаютсяпри помощи слова const.
*/

var a = 5;
console.log(a * 5);

const c = 10;
// c = 20; // недопустимо

/* Псевдотипы данных
Строка: "hello", 'hello', `hello`
Число: 120, 134.678, 3e10
boolean: true, false.
*/
console.log("10" + 2);
console.log(2 + "10");
var t = 30;
var ts = t + "";
console.log(ts);

/*Массивы
В один массив можно поместить переменные разных типов.
var arr = [];
*/
var arr = [10, "hello", true];
console.log(arr[0]); //10
console.log(arr[1]); //hello
console.log(arr[2]); //true

// В js массивы обладают свойствами коллекций
// Добавление элемента в массив
arr.push(78, "JavaScript");
console.log(arr);

/* Коллекция типа MAP */ // нельзя удалить по индексу в MAP
var map = {"422896": "Sidorov", "456789": "Ivanov", "422896": "Petrov"};

// Добавление нового элемента в коллекцию.
map["789067"] = "Volkov";

// Удаление элемента из коллекции
delete map["456789"];
console.log(map);

/* Условные конструкции */
/*
if ... else
swith ... case
*/
if (a > 10) {
    console.log("a > 10");
} else {
    console.log("a <= 10");
}
// && - логическое И
// || - логическое ИЛИ
// == - сравнение (по значению)
// != - не равно (по значению)
// === - равно (по значению + по типу данных)
// !== - не равно (по значению + по типу данных)

var month = 2;
switch (month) {
    case 1:
        console.log("January");
        break;
    case 2:
        console.log("February");
        break;
    default:
        console.log("Incorrect month value")
}

console.log(3 == '3'); // true
console.log(3 === '3'); // false

// Переменная, обьявленная через let будет видна только внутри {}, внутри которых она обьявлена
if (true) {
    var f = 36;
}
console.log(f);

if (true) {
    let h = 24;
}
//console.log(h); - h is not defined

/*Циклы
for(;;)
for ... in (в итерационную переменную записывается индекс элемента)
for ... of (в итерационную переменную будет записываться значение элемента)
while
do ... while
*/
for (let i = 0; i < 5; i++) {
    console.log(i);
}
var arr2 = [1,4,6,9];
for (let i in arr2) {
    console.log(i);
}

for (let val of arr2) {
    console.log(val);
}

// Функции и лямбда выражения
// Обьявление функции
function min(a, b, c) {
    if (a < b && a < c) {
        return a;
    }
    if (b < c) {
        return b;
    }
    return c;
}

console.clear(); // очищает консоль

let r = min(12, 10, 60);
console.log(r);

// Необязательные аргументы функции
function average(x, y, z) {
    if (x == undefined) {
        return 0;
    }
    if (y == undefined) {
        return x;
    }
    if (z == undefined) {
        return (x + y) / 2;
    }
    return (x + y + z) / 3;
}
console.log(average());
console.log(average(5));
console.log(average(5, 10));
console.log(average(5, 10, 15));

// Значение аргументов "по умолчанию"
// tips [0;1]
function  cheque(sum, tips = 0.15) {
    return sum * (1 + tips);
}

console.log(cheque(200, 0.2));
console.log(cheque(100));