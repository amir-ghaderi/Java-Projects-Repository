package dankpackage;


public class PersonTest {
	
	public void shouldReturnHelloWorld() {
		Person marcus = new Person();
		marcus.helloWorld();
	}
	
	Person myPerson = new Person();
	Person testPerson = new Person();
	Person dankPerson = null;
	
	
	Person[] person2 = {myPerson,testPerson,dankPerson,null};
	
	
}
