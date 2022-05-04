package facade;

public class Airline {
	private String name;

	public Airline(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Airline [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public Flight BookFlight(String departure, String destination) {
		Flight flight = new Flight(departure, destination, this);
		return flight;
	}
}
