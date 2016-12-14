package com.wenyu;
/*
 * 贷款计算器
 * 在输入错误的时候作出判断。并重新输入！
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Laon {

	public static void main(String[] args) {
		Rate r = new Rate();
		double monthRate = r.rate() / 1200;
		double payamount = r.money() * monthRate / (1 - 1 / (Math.pow(1 + monthRate, r.year() * 12)));
		System.out.println("你每月需要支付" + (int) (payamount * 100) / 100.0 + "元");// 每月支付金额。
	}

}

class Rate {
	public double money() {
		while (true) {
			try {

				System.out.println("请输入贷款金额：");
				Scanner sc = new Scanner(System.in);
				double amount = sc.nextDouble();

				return amount;
			} catch (InputMismatchException e) {
				System.out.println("你输入的金额有误！");
				continue;
			}
		}
	}

	public int year() {
		while (true) {
			try {
				System.out.println("请输入贷款年限：");
				Scanner sc1 = new Scanner(System.in);
				int year;
				return year = sc1.nextInt();
			} catch (Exception e) {
				System.out.println("你输入的年限有误！");
				continue;
			}
		}
	}

	public double rate() {
		while (true) {
			try {

				System.out.println("请输入年利率：");
				Scanner sc2 = new Scanner(System.in);
				double rate;
				return rate = sc2.nextDouble();
			} catch (Exception e) {
				System.out.println("你输入的年利率有误，请检查后重新输入！");
				continue;
			}
		}
	}
}
