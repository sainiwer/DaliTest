package com.wenyu2;
/*
 * 蒙特卡洛计算圆周率问题
 */
public class MonteCarloSimulation {

	public static void main(String[] args) {
		final int NUMBER_OF_TRIALS=10000000;
		int numberHits=0;
		for(int i = 0;i<NUMBER_OF_TRIALS;i++){
			double x = Math.random()*2.0-1;
			double y = Math.random()*2.0-1;
			if(x*x+y*y<=1){
				numberHits++;
			}
		}
			double pi =4.0*numberHits/NUMBER_OF_TRIALS;
			System.out.println("pi is "+ pi);
		}

	}


