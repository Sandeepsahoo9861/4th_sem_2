//7. Write a program to create a Student class with member variables name, rollNo,   and
//age. The program should allow the creation of an array of Student objects and implement
//sorting based on rollNo and age in the driver class. The sorted student arrays should be
//printed separately. Additionally, the program should utilize the Comparator interface by
//overriding the compare() method to enable custom comparisons for sorting.
package pikun;

import java.util.Arrays;
import java.util.Comparator;

// Student class
class Student1 {
    private String name;
    private int rollNo;
    private int age;

    public Student1(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age;
    }
}

// Comparator to sort by Roll Number
class RollNoComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
    	 return Integer.compare(s1.getRollNo(), s2.getRollNo());
    	
    //	return Integer.compare(s1.rollNO, s2.rollNO); we cant write this way becase rollNO is private we can use
    	//through methodonly
        
        // s1.rollNo first → Ascending order
        //  s2.RollNo first → Descending order
    }
}

// Comparator to sort by Age
class AgeComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
    	 return Integer.compare(s1.getAge() ,s2.getAge());//ascending order
    	
        
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        // Create an array of Students
        Student1[] students = new Student1[4];
        students[0] = new Student1("Alice", 104, 20);
        students[1] = new Student1("Bob", 102, 22);
        students[2] = new Student1("Charlie", 101, 19);
        students[3] = new Student1("David", 103, 21);

        // Sort by Roll Number
        Arrays.sort(students, new RollNoComparator());
        System.out.println("Students sorted by Roll Number:");
        for (Student1 s : students) {
            System.out.println(s);
//            You have a Student[] array → so you used Arrays.sort(). ✅
//
//            If you had an ArrayList<Student>, then you would use Collections.sort().


        }

        System.out.println(); // Blank line

        // Sort by Age
        Arrays.sort(students, new AgeComparator());
        System.out.println("Students sorted by Age:");
        for (Student1 s : students) { // <-- changed Student to Student1
            System.out.println(s);
        }
    }
}
