package myProject;

public class Main {
	
	public static void main (String args[]) {
		
		
		Pencil p1 = new Pencil();
		Pencil p2 = new Pencil();
		
		Pen Pen1 = new Pen();
		Pen1.setColor("Yellow",1);
		
		p1.length = 5;
		p2.length = 6;
		
		p1.setColor("blue",1);
		
		System.out.println(p1.getColor());
		
	}
}
