package codingProject2;

public class App {
	static Logger logger;
	public static void main(String[] args) {
		
		Logger al = new AsteriskLogger();
		Logger sl = new SpacedLogger();
		
		al.log("Adrieana");
		System.out.println();
		al.error("Adrieana");
		System.out.println();
		sl.log("Brother");
		sl.error("Hi how are you");
		
		
		
		
		
		
		
		
	}

}
