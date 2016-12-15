package com.wenyu;

/*
 * 计算贷款费用
 */
import java.util.Scanner;

/*
 * 使用GUI对话框输入数据，并运算，结果在GUI洁面展示。
 */
import javax.swing.JOptionPane;

public class GUIDemo {

	public static void main(String[] args) {
		// String string = JOptionPane.showInputDialog(null,"输入一个数","Input
		// Dialog Demo",JOptionPane.QUESTION_MESSAGE);
		String annualInterestRateString = JOptionPane.showInputDialog("输入贷款年利率,例如\n8.25:");// 输入的年利率。
		double annualInterestRate = Double.parseDouble(annualInterestRateString);// 将输入的年利率转换为double类型的，存储到变量中。
		double monthlyInterestRate = annualInterestRate / 1200;// 根据年利率求出月利率。

		String numberOfYearString = JOptionPane.showInputDialog("输入贷款年限,\n 例如5年:");
		int numberOfYears = Integer.parseInt(numberOfYearString);// 与下方代码作用类似。
		// Scanner sc = new Scanner(System.in);
		// double annualInterestString = sc.nextDouble();

		String loanString = JOptionPane.showInputDialog("输入贷款金额，比如120000.95：");
		double loanAmount = Double.parseDouble(loanString);
		// 下面是计算公式

		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
		totalPayment = (int) (totalPayment * 100) / 100.0;

		String output = "李庆你每月需要还款金额是：" + monthlyPayment + "总还款金额为：" + totalPayment;
		JOptionPane.showConfirmDialog(null, output);

	}

}
