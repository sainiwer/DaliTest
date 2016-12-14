package com.wenyu;

/*
 *	该demo主要是训练，默认情况下，不同数据类型的算数运算所进行的规定操作。
 */
import org.omg.Messaging.SyncScopeHelper;

public class DigitalDemo {

	public static void main(String[] args) {
		System.out.println((float) 5 / 2);// 是浮点数运算的结果（2.5）
		System.out.println(5 / 2);// 是整数运算的结果（0）
		System.out.println(5.0 / 2);
		System.out.println((double) 1 / 2); // 是double型的1.0/2（结果是double浮点型的0.5）。
		System.out.println((float) 1 / 2);// 转换为float型的1.0/2（结果是float浮点型的0.5）。
		System.out.println((int) 1.7 / 2);// 将1.7截取小数部分成为整数（1），1/2整数运算结果是0.
		int a = (int) 1.7 / 2;// 1.7转化为int型结果是1，1/2整数运算结果就是0；
		System.out.println("[(int) 1.7/2]的结果是：" + a);
		System.out.println(1.7 / 2);// 默认是double型的。

	}

}
