package com.wenyu;

/*
 * 标志位控制的循环，输入不确定个数，当输入0时，结束程序。
 */
import java.util.Scanner;

public class SentineValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("请输入一个数：");
		int data = sc.nextInt();
		while (data != 0) {

			sum += data;
			System.out.println("再输入一个值，输入0则退出程序！");
			data = sc.nextInt();
		}
		System.out.println("结果是：" + sum);
	}

}
