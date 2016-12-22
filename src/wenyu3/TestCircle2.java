package wenyu3;

public class TestCircle2 {

	public static void main(String[] args) {
		System.out.println("Before creating objects:");
		System.out.println("The number of circle objects is " + Circle2.numberOfObjects);
		Circle2 c1 = new Circle2();
		System.out.println("after create c1");
		// System.out.println("c1:radius("+c1.radius+")and number of Circle
		// Objects ("+c1.numberOfObjects+")");
		System.out
				.println("c1:radius(" + c1.radius + ")and number of Circle Objects (" + Circle2.numberOfObjects + ")");

		Circle2 c2 = new Circle2(5);

		c1.radius = 9;
		System.out.println("\n after creating c2 and modifying c1");
		// System.out.println("c1:radius("+c1.radius+") and number of Circle
		// objects("+c1.numberOfObjects+")");
		System.out.println(
				"c1:radius(" + c2.radius + ") and number of Circle objects(" + Circle2.getNumberOfObjects() + ")");
	}

}

class Circle2 {

	double radius;
	static int numberOfObjects;

	Circle2() {
		radius = 1.0;
		numberOfObjects++;
	}

	Circle2(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

}
