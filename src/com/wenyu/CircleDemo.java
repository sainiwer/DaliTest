package com.wenyu;

/*
 * 输入半径计算圆的面积，并将结果保留两位小数显示。
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		final double PI = 3.14159;// 不必重复输入一个值。*给常量赋一个顾名思义的单词（可读性强）。
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入圆的半径：");

		double r = scn.nextInt();
		double are = (PI * r * r);
		DecimalFormat df = new DecimalFormat("######0.00"); // 规定计算结果为精确到小数点后两位。
		System.out.println("计算的面积结果是:" + df.format(are) + "平方米");
		System.out.println("计算的面积结果是:" + are + "平方米");

	}

}
