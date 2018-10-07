

public class Temperature {
	
	//variables
	private float value;
	private char scale;
	
	
	//Constructors
	Temperature(){
		value = 0;
		scale = 'C';
	}
	
	Temperature(float v){
		this();
		value = v;
	}
	
	Temperature(char s) {
		this();
		scale = s;
	}
	Temperature(float v, char s){
		value = v;
		scale = s;
	}
	
	//methods
	public void setValue(float v) {
		value = v;
	}
	
	public void setScale(char c) {
		scale = c;
	}
	

	public float getValue() {
		return value;	
	}
	
	public char getScale() {
		return scale;
	}
	
	//methods to return degrees
	
	public float getTempF() {
		if (scale == 'C') {
			return 9*(value/5)+32; }
		else if (scale == 'F') {
			return value;}
		return 0;
	}

	public float getTempC() {
		if (scale == 'F') {
			return 5*(value-32)/9;}
		else if (scale == 'C') {
			return value; }
		return 0;
	}
	
	
	// Compare Methods
	
	
	public static int compare(Temperature A, Temperature B) {
		
		if(A.getScale() == 'C' && B.getScale() == 'C') {
			System.out.println("They are both C.");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println("1 - first temp is higher than second.");
			}
			
			else if (A.getValue() < B.getValue()) {
				System.out.println("-1 - first temp is lower than second.");
			}	
		}
		
		if(A.getScale() == 'F' && B.getScale() == 'F') {
			System.out.println("They are both F.");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println("1 - first temp is higher than second.");
			}
			
			else if (A.getValue() < B.getValue()) {
				System.out.println("-1 - first temp is lower than second.");
			}	
		}
		
		
		
		if(A.getScale() == 'C' && B.getScale() == 'F') {
			System.out.println("first is C and second is F.");
			if (A.getValue() == B.getTempC()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getTempC()) {
				System.out.println("1 - first temp is higher than second.");
			}
			
			else if (A.getValue() < B.getTempC()) {
				System.out.println("-1 - first temp is lower than second.");
			}	
		}
		
		if(A.getScale() == 'F' && B.getScale() == 'C') {
			System.out.println("first is F and second is C.");
			if (A.getValue() == B.getTempF()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getTempF()) {
				System.out.println("1 - first temp is higher than second.");
			}
			
			else if (A.getValue() < B.getTempF()) {
				System.out.println("-1 - first temp is lower than second.");
			}	
		}
		
		
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
}
