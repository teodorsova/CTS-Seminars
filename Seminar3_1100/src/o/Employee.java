package o;

public abstract class Employee {
	private int ID;
	private String name;
	private float salary;
	
	public Employee(int iD, String name, float salary) {
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [ID=");
		builder.append(ID);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	public abstract float calculateBonus();
}
