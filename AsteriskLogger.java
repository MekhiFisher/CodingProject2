package codingProject2;

public class AsteriskLogger implements Logger{
	
	
	
	@Override
	public void log(String str) {
		System.out.println("***" + str +"***");
	}
	
	
	@Override
	public void error(String str) {
		String asterisk = "*************";
		for (int i = 0; i < str.length(); i++) {
			asterisk += "*";
		}
		System.out.println(asterisk);
		System.out.println("***ERROR: " + str + "***");
		System.out.println(asterisk);
	}

}
