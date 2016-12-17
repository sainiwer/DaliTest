package wenyu3;
/*
 * 创建一个方法，传入一个int型数组，将该数组的元素顺序倒转。
 */
public class SwapDemo {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] list2 = reverse(list1);
		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
	}

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

}
