//Write a program to create a Book class with the following member variables: bookId ,
//bookName, and price. Implement the appropriate constructor and methods for this class.
//Additionally, create a driver class to:
//i. Instantiate two Book objects.
//ii. Compare the books based on their price.
//iii. Print the details of both books.
//Note: Override the toString() and equals() methods.

package pikun;

class Book implements Comparable<Book> {
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Price: " + price;
    }

   // @Override EQUAL METHOD
    public boolean equals(Object obj) {
        // Reference comparison (a)
        if (this == obj) return true;  // Checks if both references point to the same object

        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        // Content comparison (b)
        return Double.compare(this.price, other.price) == 0;  // Compares prices (content)
    }

  //  @Override
    public int compareTo(Book other) {
        // Content comparison (c)
        return Double.compare(this.price, other.price);  // Compares prices (content)
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming", 500.0);
        Book book2 = new Book(2, "Python Essentials", 500.0);

        // Compare using compareTo
        int result = book1.compareTo(book2);

        if (result == 0) {
            System.out.println("Both books have the same price.");
        } else if (result > 0) {
            System.out.println(book1 + " is more expensive than " + book2);
        } else {
            System.out.println(book2 + " is more expensive than " + book1);
        }

        // Compare using equals
        if (book1.equals(book2)) {
            System.out.println("Both books are equal based on price.");
        } else {
            System.out.println("Books are different based on price.");
        }
    }
}
//.......................................
//COMPARE USING COMPARETO
//Creating book1:
//
//A new Book object book1 is created with bookId = 1, bookName = "Java Programming", and price = 500.0.
//
//Creating book2:
//
//Another Book object book2 is created with bookId = 2, bookName = "Python Essentials", and price = 500.0.
//
//Calling book1.compareTo(book2)
//
//compareTo method is called with book1 as this and book2 as other.
//
//Inside compareTo, Double.compare(this.price, other.price) is called:
//
//this.price (from book1) is 500.0.
//
//other.price (from book2) is 500.0.
//
//Double.compare(500.0, 500.0) returns 0 because both prices are equal.
//
//The result of compareTo is 0, meaning the books have the same price.
//
//Comparing with result == 0:
//
//Since result == 0, the program prints:
//
//Both books have the same price.
//.......................................
//COMPARE USING EQUALTO
//Step-by-Step Execution:
//Calling book1.equals(book2):
//
//book1.equals(book2) is executed. Here book1 is the calling object (this) and book2 is the object passed as a parameter (obj).
//
//Inside the equals() method:
//
//Reference comparison:
//
//if (this == obj) return true;
//this is book1 and obj is book2. Since book1 and book2 are two different objects (they have different memory addresses), the reference comparison (this == obj) returns false.
//
//So, the program continues to the next check.
//
//Null and class check:
//
//if (obj == null || getClass() != obj.getClass()) return false;
//obj is not null (it's a valid object), and both book1 and book2 are instances of the Book class, so this condition also returns false.
//
//Content comparison:
//
//return Double.compare(this.price, other.price) == 0;
//Now the program compares the price field of both books:
//
//this.price (from book1) is 500.0.
//
//other.price (from book2) is 500.0.
//
//Double.compare(500.0, 500.0) returns 0 because both prices are the same.
//
//Since the result is 0, equals() returns true.
//
//The if condition:
//
//Since book1.equals(book2) returned true, the program enters the if block.
//
//The program then prints:
//
//Both books are equal based on price.
//Final Output:
//
//Both books are equal based on price.
//Summary:
//The equals() method first checks if both objects refer to the same memory location (reference comparison), which is not the case here.
//
//It then checks if the objects are of the same class and not null.
//
//Finally, it compares the price of both books (content comparison). Since both prices are the same (500.0), equals() returns true.
//
//Therefore, the message "Both books are equal based on price." is printeD