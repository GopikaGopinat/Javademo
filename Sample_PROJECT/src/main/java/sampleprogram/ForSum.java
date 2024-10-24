package sampleprogram;

import java.util.Scanner;

public class ForSum {
	public static void main(String args[])
	{
		int i,sum=0,n;
		System.out.println("Enter limit ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
		
	}

}
