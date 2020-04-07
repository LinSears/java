package com.company;

import java.util.HashMap;

public class Main {
// сколько раз повторяются символы
    public static void main(String[] args) {
	    String s = "wdsawfgewagwads";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

        //пример какой код символа
        char c = 'A';
        System.out.println((int)c);
        for (char i = 'A'; i < 'z'; i++) {
            System.out.print(i);
        }

        //пример сколько букв в алфавите
        int len = 'z' - 'a' + 1;
        char f = 'F';
        //char i = 'F' + 3;
        char i = (char) (f + 3);
        System.out.println();
        System.out.println(i);

        //буквы русского алфавита
        for (char j = 'А'; j < 'я'; j++) {
            System.out.print(j);
        }

        //матрица
        int [][]m = new int[3][5]; // 3 - строки, 5 - столбцы
        m[0][0] = 12;
        m[2][4] = -1;

        //
        //? extends User // new Object(); можно вставить любой обьект, наслеюуемый от User
        //? super User // !!!! !new Object(); только тот класс, который является потомком

        //тернарный оператор
        String res = m[0][0] > m[2][4] ? "yes" : "no";
        System.out.println();
        System.out.println(res);

    }
}
// 1 - тест(ОП, перегрузка, переопределение)
// 2 - задача, работа со строками
// 3 - задача, повторяются символы
// 4 - задача, матрицы
// 5 - задача, работа со строками, чтение из файла
// повторить бинарные операторы (&, | , >>, <<), swich case