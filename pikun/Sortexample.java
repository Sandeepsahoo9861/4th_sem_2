package pikun;
import java.util.ArrayList;
class Emp{
	private String name;
	private String  phone;
	private int Empid;
 
	public Emp(String name, String phone , int Empid ) {
		this.name=name;
		this.phone=phone;
		this.Empid=Empid;
	}

public String toString() {
    return "Detail [Name=" + name + ", Phone_no=" + phone + "Empid " + Empid + "]";

}
}
public class Sortexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> emp=new ArrayList<>();
		emp.add(new Emp("Sandeep", "9861652783",12));
		emp.add(new Emp("Soumya", "98617393783",2));
		emp.add(new Emp("Rakesh", "98619754524",29));
		emp.add(new Emp("Priyanshu", "99373933",13));
		System.out.println(emp);
		

	}

}

