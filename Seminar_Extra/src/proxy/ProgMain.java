package proxy;

public class ProgMain {

	public static void main(String[] args) {
		ILoginModule loginModule = new LoginModule("teo", "1234");
		ILoginModule proxyLoginModule = new LoginProxy(loginModule);
		String[] dictionaryPasswords = new String[] {
				"1233", 
				"12223", 
				"123423", 
				"3213", 
				"1234"
				};
		
		for(String passwordTry:dictionaryPasswords) {
			if(loginModule.login("teo", passwordTry)) {
				System.out.println("Logged in.");
			} else {
				System.out.println("No");
			}
		}	
		
		for(String passwordTry:dictionaryPasswords) {
			if(proxyLoginModule.login("teo", passwordTry)) {
				System.out.println("Logged in.");
			} else {
				System.out.println("No");
			}
		}	
	}
}
