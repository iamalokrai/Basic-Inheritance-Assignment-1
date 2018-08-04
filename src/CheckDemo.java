//Class to access all the members of check class
public class CheckDemo {

	//Main method
	public static void main(String args[]) {
		//New object check created
		Check check = new Check();

		// Default,public and protected can be accessed directly.
		System.out.println("Default Variable : " + check.defaultvar); 
		System.out.println("Public Variable : " + check.publicvar);
		System.out.println("Protected Variable : " + check.protectedvar);
		//For private accessing that with display method
		check.display(); 
	}

}
