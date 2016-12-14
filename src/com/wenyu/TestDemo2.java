package com.wenyu;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("请输入一个ASCII码：");
		while (true) {
			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			if (a > 0 && a < 128) {
				char ch = (char) a;
				System.out.println("你输入的整数值值是" + a + "\t对应的字符是：" + ch);
				// break;
			} else {
				System.out.println("你输入的值不在ASCII码的范围内！\n请重新输入一个数：");
				continue;
			}
		}
	}

}
