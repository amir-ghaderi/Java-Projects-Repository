
public class UltaTetra extends Tetra {
	private int teeth;
		
	UltaTetra(){
		super();
		teeth = 0;
		System.out.println("This is a Ultra");
	}
	
	public int getTeeth() {
		return this.teeth;
	}
	
	public void MakeBabies() {
		Dino Baby1 = new Dino();
		Dino Baby2 = new Dino();
		
	}

	void setTheLegs(int n) {
		setLegs(n);
	}
	

}

