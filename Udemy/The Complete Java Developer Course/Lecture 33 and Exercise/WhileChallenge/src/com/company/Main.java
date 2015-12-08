package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // Return true if an even number, otherwise return false

//        int startNum = 10;
//        int finishNum = 25;
//
//        while (startNum <= finishNum) {
//            if (!isEvenNumber(startNum)) {
//                startNum++;
//                continue;
//            }
//            System.out.println("Even number " + startNum);
//            startNum++;
//        }

        //Modify the while code above
        //Make it record the total number of even numbers it has found
        //and break once 5 are found
        //Display the total number of even numbers found

        int Num = 10;
        int LastNum = 25;
        int evenCount = 0;

        while (Num <= LastNum) {

            if (!isEvenNumber(Num)) {
                Num++;
                continue;
            }

            System.out.println("Even number: " + Num);
            Num++;

            evenCount++;
            if (evenCount >= 4) {
                break;
            }
        }
        System.out.println("Total count = " + evenCount);
    }

    public static boolean isEvenNumber(int n) {
        if ((n % 2) == 0) {
            return true;
        }
        return false;
    }
}
