package ASSIGNMENT_BITWISE_JAVA;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // Step 1: Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 3: Initialize a counter for even digits
        int evenDigitCount = 0;

        // Step 4: Process each digit of the number
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Check if the digit is even
            if (digit % 2 == 0) {
                evenDigitCount++;
            }

            // Remove the last digit
            number /= 10;
        }

        // Step 5: Output the result
        System.out.println("Number of even digits: " + evenDigitCount);
    }
}

