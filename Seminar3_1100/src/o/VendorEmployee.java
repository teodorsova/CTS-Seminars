package o;

public class VendorEmployee extends Employee {

	public VendorEmployee(int iD, String name, float salary) {
		super(iD, name, salary);
	}

	@Override
	public float calculateBonus() {
		return this.getSalary()*.05f;
	}

}
