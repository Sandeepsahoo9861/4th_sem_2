// Write a program to find xy
package ASSIGNMENT_BITWISE_JAVA;
import java.util.*;
public class POWER_Q7 {
 
	public static void main(String[] args) {
		 int n=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of x");
	int x=sc.nextInt();
	System.out.println("enter the value of y");
	int y=sc.nextInt();
	for(int i=1;i<=y;i++) {
		 n=n*x;
	}
	System.out.println("value is=" +n);
	

	}

}
