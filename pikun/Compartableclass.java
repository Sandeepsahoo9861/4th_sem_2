package pikun;
import java.util.ArrayList; 
import java.util.Collections;
class employee implements Comparable<employee> {
	int id;
	String name;
	double salary;
	public employee (int id ,String name ,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

public String toString() {//overriding the tostring method here because we can't print the direct object value
	return "id =" + id + " " + "name =" + name + " " + "salary" + salary;
}
public int compareTo(employee s) {//compareTo method, which is used for sorting objects. It is part of the
	                            //Comparable interface.
//	if (s.id > id) {
//		return 1;}
//	if (s.id < id) {
//		return -1;}
//		else
//			return 0;
//	} OR 
	 return Integer.compare(s.id, this.id); // Sorting in descending order
	// return Integer.compare(this.id, s.id);//Sorting in Ascending order
	 //🎯 Super simple trick 3-second method:

      //Code	Order
      //this, s	 Ascending
      //s, this	 Descending
	}


public class Compartableclass {

	public static void main(String[] args) {
		ArrayList <employee> z=new ArrayList();
		z.add(new employee(123 ,"Sandeep" ,60000));
		z.add(new employee(126 ,"Rockey" ,836900));
		z.add(new employee(127 ,"Sanket" ,45999));
		z.add(new employee(189 ,"Mitesh" ,89999));
		z.add(new employee(100 ,"Rakesh" ,900999));
		 Collections.sort(z);//Collections.sort(z); is used to sort the list z based on the rules you defined 
		                      //in the compareTo method of the employee class
		System.out.print(z);

	}

}
}
//...........................
//Situation | Java calls
//Tumne Collections.sort(z) likha | Java calls compareTo()
//Tumne System.out.println(z) likha | Java calls toString()
