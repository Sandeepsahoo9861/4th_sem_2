//5. Write a program to create a Student class with member variables name, rollNumber ,
//and totalMark. The program should create an array of Student objects and sort them
//using the Bubble Sort algorithm based on their roll numbers.
//Note: Implement the Comparable interface and override the compareTo() method for
//comparison.
package pikun;

import java.util.Collections;

public class Student implements Comparable<Student> {
 private String name; private int rollNumber; private double totalMark;
 public Student(String name, int rollNumber, double totalMark) {
 this.name = name;
 this.rollNumber = rollNumber;
 this.totalMark = totalMark;
 }
 public String getName() {
 return name;
 }
 public int getRollNumber() {
 return rollNumber;
 }
 public double getTotalMark() {
 return totalMark;
 }
 public String toString() {
 return "Name: " + name + ", Roll Number: " + rollNumber + " TotalMarks: " + totalMark;
 }
 public int compareTo(Student s) {
 return Integer.compare(this.rollNumber, s.rollNumber);
 }
 public static void bubbleSort(Student[] students) {
 int n = students.length;
 for (int i = 0; i < n - 1; i++) {
 for (int j = 0; j < n - 1 - i; j++) {
 if (students[j].compareTo(students[j + 1]) > 0) {
 Student temp = students[j];
 students[j] = students[j + 1];
 students[j + 1] = temp;
 }
 }
 }
 }
 public static void main(String[] args) {
 Student[] students = new Student[3];
 students[0] = new Student("Sayantan", 102, 95.5);
 students[1] = new Student("Rounak", 103, 88.0);
 students[2] = new Student("Srinjoy", 101, 92.0);
 bubbleSort(students);
 System.out.println("Sorted student details:");
 for (Student student : students) {
 System.out.println(student.toString());
 }
 }
}
// Collections.sort(student);is not used we used here manually bubble short
//students[j].compareTo(students[j + 1])
//➡️ Tum students[j] ka compareTo() method call kar rahe ho
//➡️ Aur uske andar students[j+1] pass kar rahe ho compare karne ke liye.

//.............................
//🔵 Suppose Students diye hain:
//
//Index	Roll Number
//0	5
//1	3
//2	8
//3	1
//🔵 Bubble Sort Dry Run:
//Step 1: Outer loop (i=0)
//
//(j=0) compare students[0] and students[1]
//
//compareTo(5,3) → 5>3 → compareTo() > 0 ➔ Swap
//
//New list: 3,5,8,1
//
//(j=1) compare students[1] and students[2]
//
//compareTo(5,8) → 5<8 → compareTo() < 0 ➔ No Swap
//
//(j=2) compare students[2] and students[3]
//
//compareTo(8,1) → 8>1 → compareTo() > 0 ➔ Swap
//
//New list: 3,5,1,8
//
//Step 2: Outer loop (i=1)
//
//(j=0) compare students[0] and students[1]
//
//compareTo(3,5) → 3<5 → compareTo() < 0 ➔ No Swap
//
//(j=1) compare students[1] and students[2]
//
//compareTo(5,1) → 5>1 → compareTo() > 0 ➔ Swap
//
//New list: 3,1,5,8
//
//Step 3: Outer loop (i=2)
//
//(j=0) compare students[0] and students[1]
//
//compareTo(3,1) → 3>1 → compareTo() > 0 ➔ Swap
//
//New list: 1,3,5,8
//
//🔥 Final Sorted List (by roll number):
//
//Index	Roll Number
//0	1
//1	3
//2	5
//3	8
//🔥 Important Observations:
//Har pair of students ke beech me compareTo() call hota hai.
//
//Agar compareTo() > 0 aaye, toh swap hota hai.
//
//Yeh process baar baar repeat hota hai jab tak poora array sorted nahi ho jaata.