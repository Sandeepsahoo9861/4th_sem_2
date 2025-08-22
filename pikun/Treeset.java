//6. Write a program to create a TreeSet of Integer type and perform the following
//operations:
//(a) Display the elements of the TreeSet.
//(b) Prompt the user to enter a number and check whether the number is present in the
//TreeSet.
//(c) Remove a specified element from the TreeSet

package pikun;

import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        // Create a TreeSet of Integer type
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // (a) Display the elements of the TreeSet
        System.out.println("Elements of the TreeSet: " + treeSet);

        // (b) Prompt the user to enter a number and check if it's present in the TreeSet
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it exists in the TreeSet: ");
        int num = scanner.nextInt();
        
        if (treeSet.contains(num)) {
            System.out.println("The number " + num + " is present in the TreeSet.");
        } else {
            System.out.println("The number " + num + " is not present in the TreeSet.");
        }

        // (c) Remove a specified element from the TreeSet
        System.out.print("Enter a number to remove from the TreeSet: ");
        int removeNum = scanner.nextInt();
        
        if (treeSet.contains(removeNum)) {
            treeSet.remove(removeNum);
            System.out.println("The number " + removeNum + " has been removed from the TreeSet.");
        } else {
            System.out.println("The number " + removeNum + " is not found in the TreeSet.");
        }

        // Display the updated TreeSet
        System.out.println("Updated elements of the TreeSet: " + treeSet);

        scanner.close();
    }
}

