package PACK;

// Abstract class
abstract class B {
    abstract void setmethod(); // Abstract method to be implemented by subclasses
    abstract void show();      // Abstract method to be implemented by subclasses
}

// Subclass implementing abstract methods
class Z extends B {
    int a;  // Declare instance variables
    int b;

    @Override
    void setmethod() {
        a = 77;  // Assign values to instance variables
        b = 78;
    }

    @Override
    void show() {
        System.out.println(a); // Access instance variables
        System.out.println(b);
    }
}

public class A {
    public static void main(String[] args) {
        B ob = new Z();  // Instantiate subclass Z and assign to a B reference
        ob.setmethod();  // Call the setmethod implementation in Z
        ob.show();       // Call the show implementation in Z
    }
}
