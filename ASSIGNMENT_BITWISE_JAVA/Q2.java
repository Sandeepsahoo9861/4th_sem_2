// The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise,
//it is 0. Write a Java program to count the parity of an integer number.

package ASSIGNMENT_BITWISE_JAVA;

public class Q2 {
	public class ParityCalculator {
	    public static void main(String[] args) {
	        int number = 29; // Example number
	        int parity = calculateParity(number);

	        System.out.println("The parity of the number " + number + " is: " + parity);
	    }

	    public static int calculateParity(int n) {
	        int count = 0;

	        // Count the number of 1s in the binary representation
	        while (n != 0) {
	            count += (n & 1); // Increment if the last bit is 1
	            n >>= 1;          // Shift the number to check the next bit
	        }

	        // Parity is 1 if count is odd, otherwise 0
	        return count % 2;
	    }
	}
}
	