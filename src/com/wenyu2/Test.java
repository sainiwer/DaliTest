package com.wenyu2;
/*
 * 输入两个数比较大小，最后打印出最大的数
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max, number;
		number = input.nextInt();
		max = number;// 给Max赋值。

		do {
			number = input.nextInt();
			if (number > max) {
				max = number;
			}
		} while (number != 0);
		System.out.println("max is" + max);
		System.out.println("number is" + number);

	}
}
