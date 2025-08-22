package ASSIGNMENT_BITWISE_JAVA;
import java.util.*;

public class Count_Even_no_Q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		String numberString = Integer.toString(no); // Convert the number to a string

		int Len = numberString.length();
		int[] arr = new int[Len];




		int sum=0;
		for (int j=0; j<Len;j++) {
			arr[j] = Character.getNumericValue(numberString.charAt(j));//it will put one one value to arr
		}
		for (int i=0;i<Len;i++) {
			if(arr[i]%2==0) {
				sum=sum+1;
			}
			
		}
		System.out.println(sum);

}
}
