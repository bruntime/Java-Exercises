package com.company;

public class Main {

    public static void main(String[] args) {
	//char - only one character
        // char - width of 16 (2 bytes)
        char myChar = 'D';
        //unicode character - www.unicode-table.com
        char uniChar = '\u00A9';//copyright symbol
        System.out.println("Unicode output: " + uniChar);

        boolean myBoolean = false;
        boolean isMale = true;

        //1. Find the code for the registered symbol on the same line as the copyright symbol.
        //2. Create a variable of type char and assign it the unicode value for that symbol.
        //3. Display it on screen

        char rSymbol = '\u00AE';
        System.out.println("Registered Symbol: " + rSymbol);
    }
}
