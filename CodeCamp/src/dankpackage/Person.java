package dankpackage;
import static org.junit.Assert.*;

import org.junit.Test;

public class Person {
	private String personName;
	
	public Person(){
		personName = "loser";
	}
	
	@Test
	public void helloWorld() {
		assertEquals("one","one");
	}
	

	public String getName() {
		return personName;
		
	}
	
}
