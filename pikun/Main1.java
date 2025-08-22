//6. Write a program to create an Animal class with member variables name, color, and
//type (indicating whether the animal is a pet or wild). Override the hashCode() method to
//generate a unique identifier for each object. Then, create multiple Animal objects and print
//their hash codes.

package pikun;

//1. Create the Animal class
class Animal {
 String name;
 String color;
 String type;

 // 2. Constructor to set name, color, and type
 Animal(String name, String color, String type) {
     this.name = name;
     this.color = color;
     this.type = type;
 }

 // 3. Override hashCode() method
 @Override
 public int hashCode() {
     return name.hashCode() + color.hashCode() + type.hashCode();
 }
}

//4. Main class
public class Main1 {
 public static void main(String[] args) {
     // 5. Create Animal objects
     Animal a1 = new Animal("Dog", "Brown", "Pet");
     Animal a2 = new Animal("Tiger", "Orange", "Wild");
     Animal a3 = new Animal("Cat", "White", "Pet");

     // 6. Print their hash codes
     System.out.println("HashCode of a1: " + a1.hashCode());
     System.out.println("HashCode of a2: " + a2.hashCode());
     System.out.println("HashCode of a3: " + a3.hashCode());
 }
}
