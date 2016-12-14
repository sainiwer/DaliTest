package com.wenyu2;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("输入第一个数：");
		int n1 = sc.nextInt();

		System.out.println("输入第二个数：");
		int n2 = sc.nextInt();

		int gcd = 1;
		for (int k = 2; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		System.out.println(n1 + "和" + n2 + "的最大公约数是" + gcd);
	}
}
