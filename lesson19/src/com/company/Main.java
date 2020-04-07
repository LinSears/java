package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//https://meet.google.com/iyb-szsu-uht
        USDConverter usd = new USDConverter();
        RUBConverter rub = new RUBConverter();
        System.out.println(usd.convert(100));
        System.out.println(rub.convert(35));

        USD cUSD = new USD();
        cUSD.setValue(200.30f);
        BYN cBYN = new BYN();
        cUSD.convertTo(cBYN);
        System.out.println(cBYN);
        cBYN.convertTo(cUSD);
        System.out.println(cUSD);

        String s = "awdslfioafnjuaowjuna";
        int code = s.codePointAt(0);
        System.out.println(code);
        code += 3; //a+3=d
        System.out.println((char)code);



        int str = s.length();
        System.out.println(s.length());
        char[] carray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i +1; j < s.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.println(carray[j] + " ");
                    break;
                }
            }
        }

        //String[] arr = s.split("");
    }
}
