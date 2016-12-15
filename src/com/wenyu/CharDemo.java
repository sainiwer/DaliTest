package com.wenyu;

/*
 * 字符与数值之间的转换。
 * 1.字符串可以使用+=运算，来拼接字符串。
 * 2.两个操作数进行拼接运算（+）只要其中一个操作数是字符串，结果是一个字符串类型的。
 * 
 * 
 */
public class CharDemo {

	public static void main(String[] args) {
		char n = 'A';
		System.out.println((int) n);
		int b = 90;
		System.out.println((char) 65);

		String message = "welcome to world:";
		System.out.println(message + 95);

		// 拼接之后结果是一个字符串
		String s = "hello" + 98;
		System.out.println(s);
		System.out.println("s所属的类名字叫：" + s.getClass().getName());

		// 字符串可以运用+=运算符号。
		String welcom = "welcome to my house:";
		welcom += "to do a gist!";
		System.out.println(welcom);

		// what's the differint form two ways?

		int i = 1, j = 2;
		System.out.println("i+j is:" + i + j);

		System.out.println("i+j is :" + (i + j));
		int number1 = 3;
		int number2 = 3;
		number2 += number1 + number2;
		System.out.println("number results is:\n" + number2);
	}

}
