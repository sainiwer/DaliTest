package com.wenyu;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你的贷款总额：");
		double amuont = sc.nextDouble();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("输入你贷款年限：");
		double year = sc1.nextDouble();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("输入你贷款年利率：");
		double yearRate = sc2.nextDouble();

		double monthRate = yearRate / 1200;// 求月利率
		System.out.println(monthRate);

		double payamount = amuont * monthRate / (1 - 1 / (Math.pow(1 + monthRate, year * 12)));
		System.out.println("你每月需要支付" + (int) (payamount * 100) / 100.0 + "元");// 每月支付金额。

	}

}
