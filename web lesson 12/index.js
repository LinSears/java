/* МАССИВЫ */

var arr = [1, 2, 3];

// добавление элементов в конец массива
arr.push(4, 5);
console.log(arr);

// удаление последнего элемента из массива
let deletedElem = arr.pop();
console.log(deletedElem, arr);

// добавление элементов в начало массива
arr.unshift(-1, 0);
console.log(arr);

// удаление первого элемента массива
let first = arr.shift();
console.log(first, arr);

// получение индекса элемента по его значению
let index = arr.indexOf(3); // значение искомого элемента
console.log(index);
// в случае, если искомый элемент не найден, то метод indexOf вернет -1
console.log(arr.indexOf(10));

// удаление элемента по индексу
arr.splice(2, 1); 
// 2 - индекс элементаб начиная с которого необходимо начать удаление
// 1 - количество элементов, которое необходимо удалить
console.log(arr);

// удаление элемента по его значению
let value = 4;
let i = arr.indexOf(value);
arr.splice(i, 1);
console.log(arr);

// создание копии массива
let arrCopy = arr.slice(); // копируется весь массив
let arrPartialCopy = arr.slice(1, 3);
// 1- индекс элемента, с которого начинается копирование;
// 3 - индекс элемента, которым включительно завершается копирование
console.log(arrCopy, arrPartialCopy);

// forEach - перебирает все элементы массива
arr.forEach(function(item, i, arr){
    // item - значения текущего элемента массива
    // i - индекс элемента текущего
    // arr - оригинальный массив
    console.log(item);
});

// filter - фильтрует массив по заданному критерию
arr.push(7, 4);
let filteredArr = arr.filter((item) => item % 2 != 0); // для нечетных значений
console.log(filteredArr);

// метод map - преобразует массив в соответствии с заданным критерием
let squaredArr = arr.map((item) => item * item);
console.log(squaredArr);

// every - возвращает true, если все элементы массива соответствуют заданному критерию,
// false - если какойто элемент не соответствует
let isSquare = (item) => {
    let sq = Math.sqrt(item);
    return sq == Math.trunc(sq); // trunc = удаляет дробную часть
}
let res = arr.every(isSquare);
console.log(res);
console.log([1, 49, 81, 256, 10000].every(isSquare));

// some - возвращает true, если хотя бы один из элементов из массива
// соответствует заданному критерию
console.log(arr.some(isSquare));

// reduse - возвращает результат, полученный в ходе обхода массива слева направо(сначала в конец),
// с сохранением промежуточного результата вычисления
let result = arr.reduce((prevValue, item, i, arr) => {
    // prevValue - результат последнего вызова функции callback
    // при первом срабатывании функции callback, prevValue = initialValue = 0
    // Если initialValue не указан, то в этом случае prevValue = значению первого элемента массива
    return item + prevValue;
}, 0);

// [1, 5, 8], initialValue = 0
// 1) return 1+0=1
// 2) return 5+1=6
// 3) return 8+6=14

console.log(result);

// reduseRight - то же самое, что и reduse, только обход по массиву начинается с конца(справа на лево)
// Если initialValue не указано, то prevValue будет равен последнему элементу массива.

// reverse - изменяет порядок следования элементов в массиве на противоположный
arr.reverse();
console.log(arr);

// sort - сортирует массив по заданному критерию
arr.sort((x, y) => {
    // x, y - значения элементов массива, которые в данный момент подвергаются сравнению
    // return 0 => x == 0
    // return >0 => y станет по индексу раньше
    // return <0 => x станет по индексу раньше
    return y - x; // по убыванию
});
console.log(arr);

// session и local storage
//localStorage.setItem("KEY", "JavaScript");
//sessionStorage.setItem("KEY", "JavaScript");
let local = localStorage.getItem("KEY");
console.log("local: ", local);
let session = sessionStorage.getItem("KEY");
console.log("session: ", session);
