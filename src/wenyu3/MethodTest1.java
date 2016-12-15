package wenyu3;

public class MethodTest1 {

	public static void main(String[] args) {
		System.out.println(sumi(20, 45));

	}

	public static int sumi(int x, int y) {
		int sum = 0;
		for (int i = x; x <= y; i++) 
			sum += i;
		return sum;
	}

}
