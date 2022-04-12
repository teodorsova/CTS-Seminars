package s5.singleton.v2;

public class Database {
	private static Database INSTANCE;
	
	static {
		INSTANCE = new Database();
	}
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		return INSTANCE;
	}
}
