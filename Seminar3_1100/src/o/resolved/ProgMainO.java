package o.resolved;

public class ProgMainO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emmJohn = new Employee(1, "John", 2000, "FTE");
		System.out.println(emmJohn.toString() + " " + emmJohn.calculateBonus());
		
		Employee emmMichael = new Employee(1, "Michael", 2000, "Vendor");
		System.out.println(emmMichael.toString() + " " + emmMichael.calculateBonus());
	}

}
