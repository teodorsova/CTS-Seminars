package facade;

public class Hotel {
	private String name;

	public Hotel(String name) {
		this.name = name;
	}
	
	public void BookRoom(String location) {
		System.out.println("Hotel " + name + ", location " + location);
	}
}
