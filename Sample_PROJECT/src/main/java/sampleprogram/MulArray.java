package sampleprogram;
import java.util.Scanner;
public class MulArray {
	public static void main(String args[])
	{
		int i,n,j;
		int ar1[][]=new int[3][3];
		System.out.println("Enter limit of first array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter values of first array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				ar1[i][j]=s.nextInt();
			}
		}	
		System.out.println("First array is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();	
		}
		
	}

}
