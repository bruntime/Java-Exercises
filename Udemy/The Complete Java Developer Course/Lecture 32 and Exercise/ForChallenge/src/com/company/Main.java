package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // If it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // If the count is 3, exit the for loop
        // Hint: Use the break; statement to exit

        int count = 0;

        for (int i = 12; i <= 28; i++) {
            if (isPrime(i)) {
                count++;
                if (count <= 3) {
                    System.out.println(i + " is a prime number");
                } else {
                    break;
                }
            }
        }

        //Alternate Solution

        int newCount = 0;

        for (int j = 10; j < 50; j++) {
            if(isPrime(j)) {
                System.out.println("Number " + j + " is a prime number");
                newCount++;
            }
            if (newCount == 3) {
                System.out.println("Exiting...");
                break;
            }
        }

    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
