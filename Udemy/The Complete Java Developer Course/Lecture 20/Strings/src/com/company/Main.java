package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println(myString + " concatenation " + '\u00A9');
        String numberString = "250.55";
        numberString = numberString + "49.95";

        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);
    }
}
