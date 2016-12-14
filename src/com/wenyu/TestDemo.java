package com.wenyu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		//// char a = '\u345dE';
		// char b = 'a';
		//
		// System.out.println("b+10:"+(b+10));//char类型数据与另一个数字或者char进行数值运算，结果是数值。结果是b+10:107
		// System.out.println("b+'A':"+(b+'A'));//结果是b+'A':162
		// System.out.println("b+10:"+b+10);//按照字符串的计算规则来运算，
		// System.out.println('"');
		// //下面是测试练习
		// char c='A';
		// int i=(int)c;
		// System.out.println(i);
		// double f = 1000.34;
		// int j=(int)f;
		// System.out.println(j);
		//
		// char x='a';
		// char y='c';
		// char z='b';
		//
		// int c1=(int)x;
		// int c2=(int)y;
		// int c3=(int)z;
		// System.out.println("a的整数值是："+c1);
		// System.out.println("c的整数值是："+c2);
		// System.out.println("b的整数值是："+c3);
		// System.out.println("++x的结果是："+(++x));//结果是：'a'的整数值97+1=98，再转换为字符b.
		// System.out.println("y++的结果是："+(y++));//结果是：'c'字符，在执行本行代码之后，y的整数值增加1，成为100，
		// System.out.println("x-y的结果是："+(x-y));//是两个字符的整数值相减，结果是-2。
		//
		// System.out.println("1"+1);
		// System.out.println('1'+1);//char类型的操作数与一个数字类型的值进行运算，那么结果就是一个数值。所以结果是49+1=50.
		// System.out.println("1"+1+1);//做字符串的运算，结果转化为字符串。
		// System.out.println('1'+1+1);
		// System.out.println(1+"welcome"+1+1);
		// System.out.println(1+"welcome"+(1+1));
		// System.out.println(1+"welcome"+('\u0001'+1));
		// System.out.println(1+"welcome"+'a'+1);//与字符串操作数与字符／数字一起运算，结果是字符串类型的结果。
		// *******************************
		System.out.println("请输入温度，摄氏度：");
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				double ces = sc.nextDouble();
				if (ces > 0 && ces < 299) {
					double fu = (9.0 / 5) * ces + 32;
					System.out.println("当前温度是：" + ces + "摄氏度，华氏为：" + fu + "华度");
					break;
				} else {
					System.out.println("你输入的温度不符合自然规律,请重新输入：");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("你输入的数据有误，请重新输入：");
				continue;
			}
		}
	}

}
