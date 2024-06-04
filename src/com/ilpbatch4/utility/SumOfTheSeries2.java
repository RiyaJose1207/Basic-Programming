package com.ilpbatch4.utility;

public class SumOfTheSeries2 {

	public static void main(String[] args) {
		int input=3;
		sumOfTheSeries2(input);

	}

	private static void sumOfTheSeries2(int input) {
		int num1=0;
		int num2=1;
		int num3;
		int power;
		int sum=0;
		for(int i=1;i<=input;i++)
		{
			num3=num1+num2;
			power=num3*num3*num3;
			sum=sum+power;
			num1=num2;
			num2=num3;
		}
		System.out.println(sum);
	}

}
