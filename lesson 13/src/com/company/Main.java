package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    HashSet<String> set = new HashSet<>(); //set - множество, хранит недублирующиеся уникальные элементы
        set.add("string 1");
        set.add("string 2");
        set.add("string 3");
        System.out.println("Коллекция после добавления");
        System.out.println(set);
        set.add("string 2");
        System.out.println("Коллекция после добавления дублирующего элемента"); //не добавляется
        System.out.println(set);
        set.remove("string 3");
        System.out.println("Коллекция после удаления");
        System.out.println(set);
        System.out.println(set.size());
        //Map - хранит элементы по принципу "ключ-значение"
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 1000); // Фамилии и зарплата
        map.put("Petrov", 1000);
        map.put("Sidorov", 500);
        System.out.println("После добавления");
        System.out.println(map);
        map.put("Sidorov", 900); //новое значение перезапишет старое
        System.out.println("После повышения ЗП");
        System.out.println(map);
        int value = map.get("Petrov"); //заисываем в значение
        System.out.println(value);
        // KeySet - возвращает множество ключей
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // values - возвращает список значений
        System.out.println(map.values()); //получаем список коллекции
        map.remove("Sidorov");
        System.out.println("После удаления Сидорова");
        System.out.println(map);

        //DATE
        Date d = new Date();
        System.out.println(d.getTime()); //возвращает время в милисекундах 01/01/1970
        Date d2 = new Date(2321999211234l); // время указывается тоже в формате Юникс-кода
        if (d.after(d2)) {
            System.out.println("d > d2");
        }
        if (d.before(d2)) {
            System.out.println("d < d2");
        }
        //Форматирование даты
        SimpleDateFormat df = new SimpleDateFormat("G yyyy EEEE");
        System.out.println(df.format(d2));

        /*SimpleDateFormat df2 = new SimpleDateFormat("d/M/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату:");
        String date = sc.nextLine();
        try {
            Date d3 = df2.parse(date);
            System.out.println(d3.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        } */

        //Календарь
        GregorianCalendar calendar = (GregorianCalendar)
                GregorianCalendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.MINUTE, 25);
        System.out.println(calendar);
        calendar.add(Calendar.DAY_OF_MONTH, 28);
        System.out.println(calendar);
        calendar.add(Calendar.HOUR, -23);
        System.out.println(calendar);
        calendar.roll(Calendar.DAY_OF_MONTH, 30);
        System.out.println(calendar);
        if (calendar.isLeapYear(calendar.get(Calendar.YEAR))) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
