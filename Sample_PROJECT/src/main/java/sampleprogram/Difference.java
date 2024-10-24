package sampleprogram;

import java.util.Scanner;

public class Difference {
	static int a,b;
	public static void main(String args[])
	{
		System.out.println("Enter 2 no");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		Sub sc=new Sub();
		int c=sc.sub(a,b);
		System.out.println(c);
		
	}
}
