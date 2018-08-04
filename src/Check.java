//Program to access variables with different access specifiers
public class Check {

	int defaultvar = 05;
	private int privatevar = 10;
	public int publicvar = 15;
	protected int protectedvar = 20;

	// Method to display private variable
	public void display() {

		System.out.println("Private Variable : " + privatevar);

	}

}
