package com.ilpbatch4.utility;

public class SumOfTheSeries1 {

	public static void main(String[] args) {
		int input = 4;
		sumOfTheSeries1(input);

	}

	private static void sumOfTheSeries1(int input) {
		int sum = 0;
		for(int i=0;i<input;i++)
		{
			int increment;
		    increment=2*i+1;
		    if(i%2==0)
		    	sum=sum+increment;
		    else
		    	sum=sum-increment;
		}
		System.out.println(sum);
	}

}
