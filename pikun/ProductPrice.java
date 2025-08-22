package pikun;
import java.util.*;

class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price; 
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: " + price;
    }

    // compareTo method for comparing prices
    @Override
    public int compareTo(Product other) {
        // Compare prices (this.price and other.price) and return the result
        return Double.compare(this.price, other.price); // Ascending order
        // For descending order: return Double.compare(other.price, this.price);
    }
}

public class ProductPrice {
    public static void main(String[] args) {
        // Create a list of products
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product(1, "Java Programming", 500.0));
        prod.add(new Product(2, "Python Essentials", 300.0));
        prod.add(new Product(3, "Data Structures", 400.0));
        prod.add(new Product(4, "C++ Fundamentals", 350.0));
        prod.add(new Product(5, "Web Development", 450.0));

        // Sort the products based on price using compareTo
        Collections.sort(prod);

        // Print the sorted list of products
        for (Product i : prod) {//Product is the class name, i is the variable , prod is the object or reference
            System.out.println(i);
        }
    }
}
