package wenyu3;
/*
 * 该程序的主要目的是，对数组中的元素进行一个boolean值的赋值。
 * 
 */
import java.util.Scanner;

public class LottoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] isCovered = new boolean[99];// 创建一个包含99个元素的数组。

		System.err.println("请输入数值：");
		int number = sc.nextInt();
		while (number != 0) {
			isCovered[number - 1] = true;
			System.err.println("继续输入：");
			number = sc.nextInt();
		}

		boolean allCovered = true;
		for (int i = 0; i < 99; i++) {
			if (!isCovered[i]) {// 只要isCovered 是false那么 条件成立，allCovered
								// 也就不成立，被赋予false.
				allCovered = false;
				break;
			}
		}
		if (allCovered) {
			System.err.println("全部覆盖！");
		} else {
			System.err.println("没有完全覆盖！");
		}
	}

}
