// Write a Java program that reads two integer number and create a third number
// by taking the first two digits of the first number and the last two digits of the
// second number.
 //Example: Input: 45678, 312 Output:4512
package ASSIGNMENT_BITWISE_JAVA;
import java.util.Scanner;
public class First_two_digit_Last_two_digit_Q_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no");
        int fst_no=sc.nextInt();
        System.out.println("Enter the sec no");
        int sec_no=sc.nextInt();
        int val_1=fst_no/10;
        int rev=0;
         while (sec_no!=0) {
        	 
        	int rem=sec_no%10;
        	 rev=rev*10 +rem;
        	 sec_no=sec_no/10;
         }
         
         rev=rev/10;
         System.out.println(val_1+""+rev);
	}

}
