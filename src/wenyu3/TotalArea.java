package wenyu3;

public class TotalArea {

	public static void main(String[] args) {
		Circle3[] circleArr;
		circleArr = createCircleArray();

		printCircleArray(circleArr);
		System.out.println("-----------------------------------------------");
		System.out.printf("%-30s%-15s\n", "The total area of circle is", sum(circleArr));
	}

	public static Circle3[] createCircleArray() {
		Circle3[] circleArr = new Circle3[5];

		for (int i = 0; i < circleArr.length; i++) {
			circleArr[i] = new Circle3(Math.random() * 100);
		}
		return circleArr;
	}

	public static void printCircleArray(Circle3[] circleArr) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArr.length; i++) {
			System.out.printf("%-30s%-15s\n", circleArr[i].getRadius(), circleArr[i].getArea());
		}
	}
 
	public static double sum(Circle3[] circleArr) {
		double sum = 0;

		for (int i = 0; i < circleArr.length; i++) {
			sum += circleArr[i].getArea();
		}
		return sum;
	}
}
