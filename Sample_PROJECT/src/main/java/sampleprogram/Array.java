package sampleprogram;

import java.util.Scanner;

public class Array {
	public static void main(String args[])
	{
		int i,n;
		int array[] =new int [50];
		System.out.println("Enter limit");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter array values");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.println("Array is:");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		
		
	}

}
}