package o;

public class ProgMainO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emmJohn = new FTEEmployee(1, "John", 2000);
		System.out.println(emmJohn.toString() + " " + emmJohn.calculateBonus());
		
		Employee emmMichael = new VendorEmployee(1, "Michael", 2000);
		System.out.println(emmMichael.toString() + " " + emmMichael.calculateBonus());
	}

}
