package com.wenyu2;

public class FutureTuition {

	public static void main(String[] args) {
		int year = 1;
		double tuition = 10000;
		while (tuition < 20000) {
			tuition = tuition*1.07;
			year++;
		}
		System.out.println("学费翻倍需要" + year + "年");
	}

}
