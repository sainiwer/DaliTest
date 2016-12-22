package wenyu3;

import java.text.DateFormat;

public class TestCircle {

	public static void main(String[] args) {
//		Circle circle1 = new Circle();
//		double area = (int) (circle1.getArea() * 100) / 100.00;
//		System.out.println("circle1 的半径是：" + circle1.radius + " 面积是：" + area);
//		Circle circle2 = new Circle(3);
//		Circle circle3 = new Circle(3);
//		Circle circle4 = new Circle(3);
//		Circle circle5 = new Circle(3);
		System.out.println(Circle.getNumberOfObjects());
	}
}

class Circle {

	double radius;
	static int numberOfObjects;

	Circle() {
		radius = 1.0;
		numberOfObjects++;
	}

	Circle(double newRadius) {
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
