package com.company;

public class Main {

    public static void main(String[] args) {
        //http://coderbyte.com/editor/guest:Simple%20Adding:Java
        // have the function SimpleAdding(num) add up all the numbers from 1 to num.
        // For the test cases, the parameter num will be any number from 1 to 1000.
        SimpleAdding(4);
    }

    public static void SimpleAdding (int num){
        for (int i = 0; i <= num; i++) {
            num += num;
            System.out.println(num);
            break;
        }
    }
}
