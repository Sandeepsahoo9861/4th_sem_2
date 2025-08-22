package pikun;
import java.util.ArrayList;
import java.util.Collections;
 class Ekta{
	 int empid , salary;
	 String ename;
 
 public Ekta(int empid , int salary , String ename) {
	 this.empid = empid;
	this.ename=ename;
	this.salary=salary;
 }
 public int compareTo(Ekta e) {
	 if(salary==e.salary)
		 return 0;// 0 mean both no's are same so they remain in the same order
	 if(salary> e.salary)
		 return 1;// 1 mean it will swap
	 else
		 return -1;// -1 it will remain in the same order, if the no is smaller
 }
public class Owe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Ekta> elst=new ArrayList<>();// By using ArrayList<Emp>, you are ensuring that only objects of type Emp
                                             //can be added to the list.
                       // This allows you to store and manage multiple employee records in a single collection.
       elst.add(new Ekta(101, 78000, "Sandeep"));
       elst.add(new Ekta(102, 58000, "Saurav"));
       elst.add(new Ekta(103, 59000, "Rakesh"));
       elst.add(new Ekta(103, 29000, "Rockey"));

       
	}

}
}
 
 //new Emp(101, 78000, "Sandeep") creates an object in the Heap.
 //This object does not have a direct reference variable because it is added directly to elst.
 //elst does NOT store actual objects; it stores references (addresses).
 
// Summary
// ✅ new Emp(...) creates an object in Heap.
// ✅ Constructor assigns values to object properties.
// ✅ new returns a reference (address).
// ✅ elst (ArrayList) stores references to Emp objects, not the objects themselves.
 
 
 
 
// Step-by-Step Sorting Using compareTo
// The method:
//
//
// public int compareTo(Emp e) {
//     if (salary == e.salary) return 0;
//     if (salary > e.salary) return 1;
//     else return -1;
// }
// compares two objects (this and e) and returns:
//
// 0 → Both objects are equal.
// 1 → Swap (this comes after e).
// -1 → No swap (this comes before e).
// Sorting Process
// 1st Comparison: Sandeep vs Saurav
// 
// e1.compareTo(e2);  // Sandeep (78000) vs Saurav (58000)
// 78000 > 58000, so it returns 1 (swap needed).
// ✅ New Order:
//
// [Saurav (58000), Sandeep (78000), Rakesh (59000), Rockey (29000)]
// 2nd Comparison: Sandeep vs Rakesh
// 
// e1.compareTo(e3);  // Sandeep (78000) vs Rakesh (59000)
// 78000 > 59000, so it returns 1 (swap needed).
// ✅ New Order:
// 
// [Saurav (58000), Rakesh (59000), Sandeep (78000), Rockey (29000)]
// 3rd Comparison: Sandeep vs Rockey
// 
// e1.compareTo(e4);  // Sandeep (78000) vs Rockey (29000)
// 78000 > 29000, so it returns 1 (swap needed).
// ✅ New Order:
//
// [Saurav (58000), Rakesh (59000), Rockey (29000), Sandeep (78000)]
// 4th Comparison: Saurav vs Rakesh
// 
// e2.compareTo(e3);  // Saurav (58000) vs Rakesh (59000)
// 58000 < 59000, so it returns -1 (no swap).
// ✅ Order remains the same.
// 5th Comparison: Saurav vs Rockey
// 
// e2.compareTo(e4);  // Saurav (58000) vs Rockey (29000)
// 58000 > 29000, so it returns 1 (swap needed).
// ✅ New Order:
//
// [Rockey (29000), Saurav (58000), Rakesh (59000), Sandeep (78000)]
// Final Sorted List
// After all comparisons, the employees are sorted in ascending order of salary:
//
// 
// [Rockey (29000), Saurav (58000), Rakesh (59000), Sandeep (78000)]
