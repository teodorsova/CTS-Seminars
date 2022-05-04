package facade;

public class Facade {
	public static void DoReservation(String departure, String destination) {
		Hotel hotel = new Hotel("Londol Hilton");
		hotel.BookRoom("London");
		
		Airline airline = new Airline("BlueAir");
		Flight toGo = airline.BookFlight("Bucharest", "London");
		Flight back = airline.BookFlight("London", "Bucharest");
		System.out.println("Reservation done.");
	};
}
