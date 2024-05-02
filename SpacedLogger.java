package codingProject2;

public class SpacedLogger implements Logger{

	@Override
	public void log(String str) {
		
		StringBuilder result = new StringBuilder();
		if (str.length() > 0) {
		    result.append(str.charAt(0));
		    for (int i = 1; i < str.length(); i++) {
		        result.append(" ");
		        result.append(str.charAt(i));
		}
		}
		System.out.println(result);
		
	}

	@Override
	public void error(String str) {
		StringBuilder result = new StringBuilder();
		if (str.length() > 0) {
			result.append(str.charAt(0));
			for (int i = 1; i < str.length(); i++) {
				result.append(" ");
				result.append(str.charAt(i));
			}
		}
		System.out.println("ERROR: " + result);
	}

}
