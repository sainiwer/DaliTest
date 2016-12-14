package com.wenyu;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		
		boolean  isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
		if(isLeapYear==true){
			System.out.println(year+"是闰年！");
			System.out.println(isLeapYear);
		}else{
			System.out.println(year+"不是闰年！");
		}
	}

}
