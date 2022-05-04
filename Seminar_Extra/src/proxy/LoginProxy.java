package proxy;

public class LoginProxy implements ILoginModule {

	protected ILoginModule loginModule;
	private int counter = 0;
	
	public LoginProxy(ILoginModule loginModule) {
		this.loginModule = loginModule;
	}

	@Override
	public boolean login(String username, String password) {
		if(counter <= 3) {
			counter++;
			boolean result = loginModule.login(username, password);
			if(result) {
				counter = 0;
			} else {
				counter++;
			}
			return result;
		}
		return false;
	}
}
