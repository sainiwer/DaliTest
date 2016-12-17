package wenyu3;

/*
 * 数组的复制copy
 */
public class ArrDemo02 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 45, 80 };
		int[] tar = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			tar[i] = arr[i];
		}
		for (int i = 0; i < tar.length; i++) {
			System.err.println("tar[" + i + "]的值是：" + tar[i]);
		}
	}

}
