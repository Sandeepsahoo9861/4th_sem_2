// Write a Java program to count the number of bits that are set to 1 in an integer
package ASSIGNMENT_BITWISE_JAVA;

public class Q1 {
    public static void main(String[] args) {
        int number = 29; // Example number
        int count = countSetBits(number);

        System.out.println("The number of set bits in " + number + " is: " + count);
    }

    public static int countSetBits(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1); // Increment count if the last bit is 1
            n >>= 1;         // Right shift the number to check the next bit
        }

        return count;
    }
}
