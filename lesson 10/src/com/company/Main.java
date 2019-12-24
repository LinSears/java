package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Абсолютный путь и относительный
        // Абсолютный путь к файлу
	    File f = new File("C:\\Programs\\1.txt");
	    if (f.exists()) {
	        System.out.println("Файл существует");
        } else {
	        System.out.println("Файл не существует");
        }
	    // относительный путь к файлу
        File ff = new File("1.txt");
	    if (!ff.exists()) {
            try {
                ff.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	    // проверяем файл на доступность записи
        // (только чтение) выставлен ли атрибут
	    System.out.println(ff.canWrite());
	    // delete сразу удаляет файл после вызова метода
        // ff.delete();
        // ff.deleteOnExit(); // удаляет файл после завершения программы
        // работа с папкой
        File dir = new File("D:\\vadimB\\lesson 10");
        String []files = dir.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
        File dir2 = new File("D:\\Test\\Hello");
        if (!dir2.exists()) {
            // создает только последнюю папку по указанному пути
            // dir2.mkdir();
            dir2.mkdirs(); // создает все папки по указанному пути
        }
        // чтение текстового файла
        try {
            FileReader fr = new FileReader(ff);
            int c = fr.read();
            while (c != -1) {
                System.out.print((char)c);
                c = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  запись в файл
        try {
            FileWriter fw = new FileWriter("2.txt");
            fw.write("Hello\nWorld\nПривет мир");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // преобразование строки в число
        try {
            FileReader fr2 = new FileReader("Input.txt");
            // int []numbers = new int[6];
            int c = fr2.read();
            String number = "";
            while (c != -1) {
                if ((char)c == ' ') {
                    int v = Integer.parseInt(number);
                    System.out.println(v * v);
                    number = "";
                } else {
                    number += (char) c;
                }
                c = fr2.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
