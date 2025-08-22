// Write a program to find the reverse of a number. For example, if the input is
// 123 output is 321, and if the input is-245 output is-542
package ASSIGNMENT_BITWISE_JAVA;
import java.util.Scanner;
public class Reverse_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value to which u want to make reverse");
		int no=sc.nextInt();
	    int rem;
		int rev=0;
		while(no !=0) {
			rem=no%10;
			rev=rev*10 +rem;
			 no=no/10;
			
		}
		 System.out.println(rev);

	}
}
