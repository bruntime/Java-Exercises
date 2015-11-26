package com.company;

public class Main {

    public static void main(String[] args) {
	// 2 data types to deal with decimals: float and double
        //float - single precision
        //double - double precision

        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3;

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3;

        System.out.println("myIntValue =" + myIntValue);
        System.out.println("myFloatValue =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);

        //Convert a given number of pounds to kilograms
        //1. Create a variable to store the number of pounds
        //2. Calculate the number of kilograms for the number above
        //and store in a variable
        //3. Print out the result.
        //
        //Notes: 1 pound is equal to 0.45359237 kilograms

        double poundToKilogram = 0.45359237;
        int pounds = 200;
        float convertedPound = (float) (pounds * poundToKilogram);
        System.out.println(pounds + "converted to Kilograms = " + convertedPound + " kgs");
    }
}
