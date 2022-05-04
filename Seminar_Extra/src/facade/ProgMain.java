package facade;

public class ProgMain {

	public static void main(String[] args) {
		/*Hotel hotel = new Hotel("Londol Hilton");
		hotel.BookRoom("London");
		
		Airline airline = new Airline("BlueAir");
		Flight toGo = airline.BookFlight("Bucharest", "London");
		Flight back = airline.BookFlight("London", "Bucharest");*/
		
		Facade.DoReservation("Bucharest", "London");
	}

}
