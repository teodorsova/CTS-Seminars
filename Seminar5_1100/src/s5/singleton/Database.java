package s5.singleton;

public class Database {
	private static Database INSTANCE = new Database();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		return INSTANCE;
	}
}
