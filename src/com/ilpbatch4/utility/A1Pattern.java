package com.ilpbatch4.utility;

public class A1Pattern {

	public static void main(String[] args) {
		int n=4;
		a1Pattern(n);

	}
    private static void a1Pattern(int r) {
        int s = r - 1;
        int c = 1;
        for(int i = 1; i <= r; i++)
        {
            char ch = 'A';
            int num = 2;
            for(int j = 1; j <= s; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= c; j++)
            {
                System.out.print(ch);
                ch = (char) (ch+1);
            }
            for(int j = 1;j <= c; j++)
            {
                System.out.print(num);
                num=num+2;
            }
            c = c + 1;
            s--;
            System.out.println("");
        }
    }
	}
