package com.wenyu;

/*
 * 该程序是一个查询整数值与字符之间转换的一个程序，选择不同的转换方式，进行相应的转换。
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class CharSwitchDemo {

	public static void main(String[] args) {
		System.out.println("请选择【查询类型】：整数值转【字符】的方法请输入【1】or 字符转【整数值】请输入【2】：");
		while (true) {
			Scanner sc1 = new Scanner(System.in);

			int a = sc1.nextInt();

			if (a != 1 && a != 2) {
				System.out.println("你的输入有误！请输入【1】或者【2】进行选择！");
			} else if (a == 1 || a == 2) {

				switch (a) {
				case 1:
					System.out.println("你选择的是整数值转ASCII码的方法，请继续操作:");
					Tes.number();
					break;
				case 2:
					System.out.println("你选择的是ASCII码转整数值运算，请继续操作：");
					Tes.asc();
				default:
					break;
				}
			}
		}

	}
}

class Tes {
	public static void number() {
		System.out.println("请输入一个ASCII码：");
		while (true) {
			try {
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
			} catch (InputMismatchException e) {
				System.out.println("你输入的数据类型有误！请重新输入一个整数范围0到128之间的整数：");
				continue;
			}
		}
	}

	public static void asc() {
		System.out.println("请输入一个字符：");
		while (true) {
			Scanner sc = new Scanner(System.in);
			String string1 = sc.next();
			char[] stringArr = string1.toCharArray();
			char ch1 = stringArr[0];
			int a = (int) ch1;
			System.out.println("你输入的字符是：" + ch1 + "\t对应的整数值是" + a);
		}
	}
}
