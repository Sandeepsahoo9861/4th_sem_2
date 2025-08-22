package pikun;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;

class employeeA {
    int id;
    String name;
    double salary;

    public employeeA(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "id=" + id + " name=" + name + " salary=" + salary;
    }
}

// Corrected Comparator class (outside the employee class)
class idsorting implements Comparator<employeeA> {//when we use comparator,comparator is implement by idsorting
	                                               // not employee A it's the property of java;
	                                          // but if we use compartable employeeA would implement compartable
	                                           // it's the property of java(sir told me)
    public int compare(employeeA s1, employeeA s2) {
 //      if (s1.id > s2.id)
//            return 1;
//        else if (s1.id < s2.id)
//            return -1;      
//       else
//            return 0;
    	return Integer.compare(s1.id, s2.id);//it is predefined in java
    	                                   //If you're still confused, just remember this:

                                           // s1.id first → Ascending order
                                           //  s2.id first → Descending order
    }
}
class salsorting implements Comparator<employeeA> {
    public int compare(employeeA s1, employeeA s2) { 
        if (s1.salary > s2.salary)
            return 1;
        else if (s1.salary < s2.salary)
            return -1;
        else
            return 0;
    }
}


public class Comparatorclass {
    public static void main(String[] args) {
        ArrayList<employeeA> z = new ArrayList<>();
        z.add(new employeeA(123, "Sandeep", 60000));
        z.add(new employeeA(190, "Rockey", 836900));
        z.add(new employeeA(127, "Sanket", 45999));
        z.add(new employeeA(189, "Mitesh", 89999));
        z.add(new employeeA(100, "Rakesh", 900999));

        // Using Comparator to sort by ID
        Collections.sort(z, new idsorting());

        System.out.println(z);
        Collections.sort(z, new salsorting());//With Comparator → We need new idsorting() (external logic).
                                          // new idsorting() creates an instance of the idsorting class,
                                      // which implements Comparator<employeeA>. This instance is required when
                                        //   sorting because Comparator is an external sorting 
                                      //  strategy (unlike Comparable, which is built into the class).
        
        
        System.out.println(z);
    }
}
