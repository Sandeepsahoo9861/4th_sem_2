package sANDEEP_IMPORTANT;


	class Book {
	    String title;
	    Book(String title) {
	        this.title = title;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true; // same memory
	        if (obj == null || getClass() != obj.getClass()) return false; // not same class
	        Book book = (Book) obj;
	        return title.equals(book.title); // compare titles
	    }
	}

	public class Equalmthod_overide {
	    public static void main(String[] args) {
	        Book b1 = new Book("Java");
	        Book b2 = new Book("Java");

	        System.out.println(b1 == b2);        // false (different memory)
	        System.out.println(b1.equals(b2));   // // it by defult behave like == we have to overide so that i behave like equals
	        //which compare content
	    }
	}
//Memory address check memory address and .equals method check Content (characters) but equals method 
// if the class doesn’t override .equals(), then .equals() behaves like ==, because the default from Object compares memory addresses.
//	 we do not need to override .equals() yourself when using built-in classes like:
//
//		String
//
//		Integer
//
//		Double
//
//		ArrayList
//
//		HashSet
//
//		HashMap
//
//		Why?
//		Because these Java library classes have already overridden .equals(), .toString(), and .hashCode() properly inside their class definition.
	//EXAMPLE
//	Integer a = 100;
//	Integer b = 100;
//
//	System.out.println(a.equals(b));     // true (compares number)
//	System.out.println(a.toString());    // "100"

