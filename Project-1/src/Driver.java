

public class Driver {
	
	public static void main (String args[]) {
		if(args.length == 0) {
			System.out.println("No command line argument entered.");}
		else {
			String arg1 = args[0];
			String arg2 = args[1];
			System.out.println("This is " + arg1 + "and " + arg2);}
		
		float val = 12.0f;
		
		Temperature one = new Temperature();
		Temperature two = new Temperature(val);
		Temperature three = new Temperature('F');
		Temperature four = new Temperature(70,'F');
		
		
		System.out.println("Temp in C is: " + four.getTempC());
		System.out.println("Temp in F is: " + four.getTempF());
		
		Temperature.compare(one, two);
		Temperature.compare(two, three);
	
	}
}