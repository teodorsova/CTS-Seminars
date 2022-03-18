package i;

public interface IPrintTasks {
	boolean scan(String content);
	boolean printFromExternalDevice(String content);
	boolean print(String content);
	boolean openClose(boolean state);
	boolean badgeAuth(String content);
	boolean fax (String content, String phoneNo);
}
