package com.wenyu;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 100);

		int guess = -1;

		while (guess != number) {
			System.out.println("请输入0到100之间的数：");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();
			if (guess < number) {
				System.out.println("你猜的数太小了！");
			} else if (guess > number) {
				System.out.println("你猜的数太大了！");
			} else if (guess == number) {
				System.out.println("你猜对了！");
			}
		}

	}

}
