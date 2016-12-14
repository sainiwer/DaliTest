package com.wenyu;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("请输入时间（秒）");
//		int time = sc.nextInt();
//		int min = time / 60;// 求得整数部分。
//		int remainningSeconds = time % 60;// 余下的秒数
//		System.out.println("转换之后的时间是" + min + "分" + remainningSeconds + "秒");
//		System.out.println(System.currentTimeMillis()/1000%60);
//		int i=1;
//		i++;
//		++i;
//		System.out.println(i);
//		System.out.println(++i);
//		int i=10;
//		int newNum =10*i++;
//		System.out.println(newNum);
		int i=10;
		int newNum = 10*(++i);
		System.out.println(newNum);
	}
}
