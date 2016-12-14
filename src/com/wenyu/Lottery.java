package com.wenyu;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		while(true){
		int lottery = (int)(Math.random()*100);
		System.out.println(lottery);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("请输入一个两位数：");
		int guess = sc1.nextInt();
		int lotteryDigtal1 = lottery/10;
		int lotteryDigtal2 = lottery%10;
		
		int guessDigtal1 = guess/10;
		int guessDigtal2 = guess%10;

		if(guess==lottery){
			System.out.println("恭喜你，获得$10,000");
		}
		else if(guessDigtal1==lotteryDigtal2 && guessDigtal2==lotteryDigtal1){
			System.out.println("恭喜你，获得$3,000");
		}else if(guessDigtal1==lotteryDigtal1 || guessDigtal1==lotteryDigtal2
				|| guessDigtal2==lotteryDigtal1||guessDigtal2==lotteryDigtal2){
			System.out.println("恭喜你，获得$1,000");
		}
		else{
			System.out.println("对不起，你没有中奖！");
		}
		System.out.println("开奖号码是："+lottery);
		
		int count = 5;
		double amount=45.56;
		System.out.printf("count is %d amount is %4.2f",count,amount);
	}

}
}