package ASSIGNMENT_BITWISE_JAVA;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x");
		int x=sc.nextInt();
		System.out.println("enter the value of y");
		int y=sc.nextInt();
		int var=1;
		int pow;
		while(y>0) {
		var=var*x;
		y--;
		}
		System.out.println(var);

	}

}
