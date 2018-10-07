
public class Tetra extends Dino {
	private int legs;
	
	Tetra(){
		super();
		legs = 3;
		System.out.println("This is a Tetra");
	}
	
	Tetra(String n,int l){
		super(n);
		legs = l;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int n) {
		this.legs = n;
	}
	
}

