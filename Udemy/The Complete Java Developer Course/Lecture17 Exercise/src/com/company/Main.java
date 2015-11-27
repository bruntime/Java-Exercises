package com.company;

public class Main {

    public static void main(String[] args) {

        //1. Create a byte variable and set it to any valid byte number.
        byte byteNum = 10;

        //2. Create a short variable and set it to any valid short number.
        short shortNum = 20;

        //3. Create a int variable and set it to any valid int number.
        int intNum = 50;

        //4. Create a variable of type long and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short plus the int
        long longNum = 50000L + (10L * (byteNum + shortNum + intNum));

        System.out.println(longNum);
    }
}
