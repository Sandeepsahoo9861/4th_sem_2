package ASSIGNMENT_BITWISE_JAVA;

public class print_100_prime_no {//its wrong code,i did some logical error

	public static void main(String[] args) {
		System.out.println("2");
		int count = 0;
		int num=3;
		while(count <100) {
			
			for(int i=2;i<num;i++) {
				if (num % i ==0) {
					num ++;
					break;
				}
				else {
					System.out.println(num);
					num ++;
					count ++;
					break;
				}
				
			}
			
		}
	}

}
