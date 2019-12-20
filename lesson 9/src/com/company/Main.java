package com.company;

public class Main {

    public static void main(String[] args) {
	    /*int a = 10;
	    a = a / 0;*/
	    int index = 1;
        int[] a = new int[3];
	    try {
	        // помещаем код, который потенциально может вызвать исключение
            a[index] = 17;
            index = index / 0;
            System.out.println("Эта надпиись не должна появляться");
        }
	    catch (ArrayIndexOutOfBoundsException e) {
	        e.printStackTrace();
	        System.out.println("Что-то пошло не так");
            }
        catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        }
	    System.out.println("Я не вылетела");

	    // обработка и генерация пользовательских исключений
	    try {
	        // throw генерирует исключение
	        throw new MyException();
        }
	    catch (MyException e) {
	        System.out.println(e.getMessage());
	        System.out.println(e.timestamp);
        }

	    // Порядок catch-ей имеет значение.
        // exception и throwable всегда должны находиться ниже, чем пользовательские исключения.
        // Если среди catch-ей присутствует  класс exception или throwable, то этот catch сработает
        // в том случае, если не сработал ни один из пользовательских классов-исключений.
        try {
            test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {

        }

        // Игра угадай число
        Game game = new Game();
        game.start();

    }

    public static void test() throws MyException, RuntimeException {
        getMoney(-100);
    }

    public static void getMoney(int money) throws MyException, RuntimeException {
        if (money <= 0 || money > 1000) {
            throw new MyException();
        }
        System.out.println("Деньги сняты");
        throw new RuntimeException();
    }
}
