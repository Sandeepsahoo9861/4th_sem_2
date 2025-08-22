package pikun;

class Laptop {
    String model;
    int price;
    
    public String toString() {
        return model + ":" + price;
    }
    
    public boolean equals(Laptop that) {
        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        } else {
            return false;
        }
    }
}

public class Equalto {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Laptop ob1 = new Laptop();
        ob1.model = "Lenovo Yoga";
        ob1.price = 1000;
        
        Laptop ob2 = new Laptop();
        ob2.model = "Lenovo Yoga";
        ob2.price = 1000;
        
        boolean result = ob1.equals(ob2);
        System.out.println(result);
    }
}