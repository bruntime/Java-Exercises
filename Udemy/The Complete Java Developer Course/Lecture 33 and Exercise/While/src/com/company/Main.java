package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
        //do while loop executes at least once
        do {
            System.out.println("Count value was " + count);
            count ++;

            if (count > 100) {
                break;
            }

        } while (count != 6);
    }
}
