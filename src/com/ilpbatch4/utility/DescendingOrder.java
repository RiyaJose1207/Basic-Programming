package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int num1=5;
		int num2=3;
		int num3=10;
		descendingOrder(num1,num2,num3);
	}

	private static void descendingOrder(int num1, int num2, int num3) 
	{
		if(num1>num2 && num1>num3)
		{
			System.out.print(num1+" ");
			if(num2>num3)
			{
				System.out.print(num2+" ");
			    System.out.print(num3+" ");
			}
			else
			{
				System.out.print(num3+" ");
				System.out.print(num2+" ");
			}
		}
		if(num2>num1 && num2>num3)
		{
			System.out.print(num2+" ");
			if(num1>num3) 
			{
				System.out.print(num1+" ");
				System.out.print(num3+" ");
			}
			else
			{
				System.out.print(num3+" ");
				System.out.print(num1+" ");
			}
		}
		if(num3>num1 && num3>num2)
		{
			System.out.print(num3+" ");
			if(num1>num2)
			{
				System.out.print(num1+" ");
				System.out.print(num2+" ");
			}
			else
			{
				System.out.print(num2+" ");
				System.out.print(num1+" ");
			}
		}	    
	}
}
