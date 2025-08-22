// Write a program to check whether a number is palindrome or not
package ASSIGNMENT_BITWISE_JAVA;
import java.util.Scanner;
public class PALINDROME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the value to check palindrome");
         int no=sc.nextInt();
        int store_n=no;
         int rev=0;
         int rem;
         while(no!=0) {
        	 rem=no%10;
        	 rev=rev*10 + rem;
        	 no=no/10;
         }
         
         if (store_n==rev) {
        	 System.out.println("Yes the no is palindrome");
         }
         else {
        	 System.out.println(" no it  is not a palindrome");
         }
	}

}
