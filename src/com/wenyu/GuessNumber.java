package com.wenyu;

/*
 * 猜数字游戏，并根据输入提示输入的数据是偏大还是偏小。
 */
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
