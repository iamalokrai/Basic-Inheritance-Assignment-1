// demo class to check the test cases for shape class
public class ShapeDemo {

	public static void main(String[] args) {

		Shape circle = new Circle(5); // Upcasting with Circle Class
		Shape polygon = new Polygon(5); // upcasting with Polygon Class
		Shape rectangle = new Rectangle(4, 5); // upcasting with Rectangle Class

		circle.draw();
		polygon.draw();
		rectangle.draw();

	}

}
