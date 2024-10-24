package sampleprogram;

import java.util.Scanner;

public class ArraySum {
	public static void main(String args[])
	{
		int i,n,sum=0;
		int array[]=new int[50];
		System.out.println("Enter limit");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter values");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
			sum=sum+array[i];
		}
		System.out.println("Array is");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Sum is "+sum);
		
	}

}
