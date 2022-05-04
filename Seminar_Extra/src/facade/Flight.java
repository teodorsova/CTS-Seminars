package facade;

public class Flight {
	private String departure;
	private String destination;
	private Airline airline;
	
	public Flight(String departure, String destination, Airline airline) {
		super();
		this.departure = departure;
		this.destination = destination;
		this.airline = airline;
	}
	
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flight [departure=");
		builder.append(departure);
		builder.append(", destination=");
		builder.append(destination);
		builder.append(", airline=");
		builder.append(airline);
		builder.append("]");
		return builder.toString();
	}
	
	
}
