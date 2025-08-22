// Write a Java program that reads two float numbers and checks whether the
// difference between these two numbers is less than ϵ (ϵ < 1)
package ASSIGNMENT_BITWISE_JAVA;
import java.util.Scanner;
public class check_less_Q_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		float a=sc.nextFloat();
		System.out.println("Enter the second no");
		float b=sc.nextFloat();
		float k=a-b;
		if(k<1) {
			System.out.print("yes it lass than");
		}
		else{
			System.out.println("no it is not less than");
		}
		

	}

}
