package wenyu3;

/*
 * 二分查找方法。
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 78, 99 };
		System.out.println(binarySearch(arr, 79));
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int hight = list.length - 1;
		while (hight >= low) {
			int mid = (low + hight) / 2;

			if (key < list[mid]) {
				hight = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -low - 1;
	}
}
