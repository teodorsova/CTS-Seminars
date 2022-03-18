package o;

public class FTEEmployee extends Employee {
	
	

	public FTEEmployee(int iD, String name, float salary) {
		super(iD, name, salary);
	}

	@Override
	public float calculateBonus() {
		return this.getSalary()*.1f;
	}

}
