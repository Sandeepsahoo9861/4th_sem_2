package ASSIGNMENT_BITWISE_JAVA;
import java.util.Scanner;
public class even_for_true_odd_for_false {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
       int no=sc.nextInt();
       System.out.println((no % 2==0)? true:false);
	}

}
