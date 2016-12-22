package wenyu3;

/*
 * 给方法传递对象参数，java中始终使用的是值传递，对于对象而言传递的是引用对象的值。
 */
public class TestPassObject {

	public static void main(String[] args) {
		Circle3 myCircle = new Circle3(1);

		int n = 5;
		printAreas(myCircle, n);
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);

	}

	private static void printAreas(Circle3 myCircle, int n) {
		System.out.println("radius \t\t Area");
		while (n >= 1) {
			System.out.println(myCircle.getRadius() + "\t\t" + myCircle.getArea());
			myCircle.setRadius(myCircle.getRadius() + 1);
			n--;
		}

	}

}
