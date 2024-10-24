package sampleprogram;

public class MultiArray {
	public static void main(String args[])
	{
		int ar[][]= {{1,2,3},{4,5,6}};
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
