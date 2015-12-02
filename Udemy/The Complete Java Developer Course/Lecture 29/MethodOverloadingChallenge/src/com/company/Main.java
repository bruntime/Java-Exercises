package com.company;

//Create a method called calcFeetAndInchesToCentimetres
//Needs to have two parameters.
//
//Validate that the first parameter feet is >= 0
//Validate that the 2nd parameter inches is >=0 and <=12
//Return -1 from the method if either of the above is not true
//
//Create a 2nd method of the same name but with only one parameter
//inches is the parameter
//Validate that it's >=0
//Return -1 if it is not true
//
//Hints: Use double for your number data types
//1 inch = 2.54cm and 1 foot = 12 inches
//Use www.metric-conversions.org/length/feet-to-centimeters.html
//to confirm that your code is calculating correctly

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimetres(5.25, 0);
        calcFeetAndInchesToCentimetres(600);
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches){

        double ftConvertedToInches = feet * 12.0;
        double ftToCentimetres = (ftConvertedToInches + inches) * 2.54;

        if ( feet >= 0 && inches >= 0 && inches <= 12 ){
            System.out.println(feet + " ft " + inches + " inches = " + ftToCentimetres + " centimetres");
        }

        return -1;
    }

    public static double calcFeetAndInchesToCentimetres(double inches){

        double inchToCentimetres = inches * 2.54;

        if ( inches >= 0  ){
            System.out.println(inches + " inches = " + inchToCentimetres + " centimetres");
        }

        return -1;
    }
}
