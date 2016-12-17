package wenyu3;


import java.util.Scanner;

public class MethodTest1 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		System.out.println("调用swap方法之前，num1 是" + num1 + "num2是" + num2);
		swap(num1, num2);

		System.out.println("调用swap方法之后，num1 是\t" + num1 + "\tnum2是\t" + num2);

	}

	public static void swap(int n1, int n2) {
		System.err.println("\t Inside the swap method");
		System.out.println("\t Befor swaping n1 is" + n1 + "n2 is " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("\t After swaping n1 is\t " + n1 + "n2 is  " + n2);
	}
 
}
