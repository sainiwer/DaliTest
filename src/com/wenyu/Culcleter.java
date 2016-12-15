package com.wenyu;

/*
 * 输入数字（102283.32784823784）默认是double型号，
 * 采用java预置的保留两位小数和自定义类型转换的保留两位小数得出结果，会有原理上的差异。
 * 输入营业额 preace ,计算		营业税=营业额*0.06
 * 将营业税值转换为int型，再除以一个double型，结果是double类型
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Culcleter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入营业额：");
		double preace = sc.nextDouble();

		double tax = preace * 0.06;
		System.out.println(tax);
		System.out.println((int) (tax * 100) / 100.0);
		DecimalFormat df = new DecimalFormat("######0.00");// 结果保留两位小数（四舍五入方式）
		System.out.println(df.format(tax));

		System.out.println((4195835 / 3145727) * 3145727 - 4195835);
	}

}
