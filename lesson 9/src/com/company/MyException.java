package com.company;

public class MyException extends Exception {
    public long timestamp; //в нем будет храниться время когда произошло исключение

    public MyException() {
        super();
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String getMessage() {
        return "MyException error";
    }
}
