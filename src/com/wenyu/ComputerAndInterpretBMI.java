package com.wenyu;

import java.util.Scanner;

public class ComputerAndInterpretBMI {

	public static void main(String[] args) {
		final double KILOGRAMS_PER_POUND=0.45359237;
		final double METERS_PER_INCH=0.0254;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入体重：");
		double weight =sc.nextDouble();
		System.out.println("输入身高：");
		double hight = sc.nextDouble();
		
//		double weightSwitch = weight/KILOGRAMS_PER_POUND;
//		double hightSwitch = hight/METERS_PER_INCH;
		
		double bmi = (weight)/Math.pow(hight, 2);
		System.out.println("bmi值是"+bmi);
		if(bmi<16){
			System.out.println("严重偏轻！");
		}
		else if(bmi<18){
			System.out.println("偏轻！");
		}
		else if(bmi<24){
			System.out.println("正常体重！");
		}
		else if(bmi<29){
			System.out.println("超重！");
		}
		else if(bmi<35){
			System.out.println("严重超重！");
		}else {
			System.out.println("非常严重超重！");
		}

	}

}
