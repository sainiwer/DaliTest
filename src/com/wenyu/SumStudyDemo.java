package com.wenyu;

/*
 * 产生两个随机数number1，number2，
 * 1.保证两个数的大小关系是number1>number2，需要用到转换。
 * 2.进行正确答案以及错误答案的判断
 */
import java.util.Scanner;

public class SumStudyDemo { 

	public static void main(String[] args) {
		for(int i=0;i<1000;i++){
		System.out.println((int)(Math.random()*10));
		}
	
		while (true) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What's" + number1 + "-" + number2 + "?");
			try {
				Scanner sc = new Scanner(System.in);

				int answer = sc.nextInt();

				if (number1 - number2 == answer) {
					System.out.println("你的答案是正确的！");
					continue;
				} else {
					System.out.println("你答错了！\n" + number1 + "-" + number2 + "应该是：" + (number1 - number2));
					continue;
				}

			} catch (Exception e) {
				System.out.println("你的答案不是合法的输入！");
			}
		}
	}
}
