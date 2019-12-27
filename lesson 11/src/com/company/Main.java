package com.company;

public class Main {

    public static void main(String[] args) {
	    User u = new User();
	    u.language = Language.EN;
	    switch (u.language) { // в скобках указывается значение, которое мы хотим проверить
            case EN:
                System.out.println("Выбран иностранный язык");
                break;
            case BY:
            case RU:
            case UA:
                System.out.println("Язык не иностранный");
        }
        System.out.println(Language.RU);

	    u.color = Color.GREEN;
	    System.out.println(u.color.getValue());
	    //
	    Math m = Math.SUM;
	    System.out.println(m.action(23, 12));
	    m = Math.MULTIPLY;
	    System.out.println(m.action(5,4));

	    // String
        String s = "hello";
        String s2 = new String("not recommended"); // то же самое
        // StringBuilder
        StringBuilder sb = new StringBuilder("abcdefg");
        sb.append("hijk"); // добавляет конец строки
        // StringBuffer
        // он полностью равен стрингбилдеру, но стрингбаффер потокобезопасный

        // String
        String str = "   hello world   ";
        // charAt возвращает символ строки по указанному индексу
        str.charAt(6); // []
        System.out.println(str.charAt(6));
        System.out.println(str.codePointAt(6));
        // преобразует строку в массив байт
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++ ) {
            System.out.println(b[i]);
        }
        // преобразование массива байт в строку
        String strFromBytes = new String(b);
        // сравнивает 2 строки между собой без учета регистра
        System.out.println("abCDef".equalsIgnoreCase("aBCDeF"));
        // возвращает индекс символа или строки в исходной строке. Если совпадение не найдено, возвращает "-1"
        // регистр учитывается
        System.out.println(str.indexOf("wor"));
        System.out.println(str.indexOf('$'));
        // ластИндексОф == индексОф, только поиск начинается с конца исходной строки
        System.out.println("hello".indexOf('l'));
        System.out.println("hello".lastIndexOf('l'));
        // реплейс заменяет подстроку в исходной строке. не модифицирует, а изменяет копию
        String str2 = str.replace("hello", "hi");
        System.out.println(str2);
        // сплит = разделяет строку по символу либо строке
        str.split("");
        "hello all hi".split(" "); // [hello, all, hi]
        String[] chunks = str.split(" ");
        for (int i = 0; i < chunks.length; i++) {
            System.out.println(chunks[i]);
        }
        // сабстринг выделяет подстроку в строке
        // 8 - начальный индекс в строке
        // 13 - конечный индекс
        System.out.println(str.substring(8, 13));
        // приведение регистров
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
