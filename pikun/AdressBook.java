//Write a Java program that includes a class Address with member  variables plotNo, at,
//and post. The class should define a parameterized constructor to initialize these attributes.
//Create a TreeMap, where the key is the name of a person (String), and the value is an
//Address object. Insert the required key-value pairs into the TreeMap and use an Iterator
//to display the entries. 

package pikun;

import java.util.Map;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    // Parameterized constructor to initialize the attributes
    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    // toString method to return a string representation of the Address object
    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}

public class AdressBook {
    public static void main(String[] args) {
        // Create a TreeMap where the key is String (name), and the value is Address
        TreeMap<String, Address> addressBook = new TreeMap<>();

        // Insert some entries into the TreeMap
        addressBook.put("Rahul", new Address("123", "Main St", "CityA"));
        addressBook.put("Ankan", new Address("456", "High St", "CityB"));
        addressBook.put("Shibam", new Address("789", "Park Ave", "CityC"));

        // Using enhanced for loop to iterate through the TreeMap
        for (Map.Entry<String, Address> entry : addressBook.entrySet()) {
            // Access the key (name) and value (address) from each entry
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}
