package com.company;

public class Main {

    public static void main(String[] args) {
        //summary of operators: http://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You get the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        boolean isCar = false;
        //ternary operator:
        boolean wasCar = (isCar) ? true : false; //if isCar evaluates to true, return true otherwise return false

        //1. Create a double variable with the value 20
        //2. Create a second double variable with the value 80
        //3. Add both numbers up and multiply by 25
        //4. Calculate the remainder of the total and 2300
        //5. Write an "if" statement that displays a message
        //6. "Total was over the limit" if the remaining total is
        //   equal to 200 or less

        double a = 20d;
        double b = 80d;
        double total = (a + b) * 25; //Java operator precedence: http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        System.out.println(total);
        double remainder = total % 2300;

        if (remainder <= 200)
            System.out.println("Total was over the limit");
    }
}
