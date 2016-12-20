package wenyu3;

import java.text.DateFormat;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println("circle1 的半径是：" + circle1.radius + " 面积是：" + circle1.getArea());
	}
}

class Circle {
	double radius;

	Circle() {
		radius = 1.0;
	}

	Circle(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}
}
