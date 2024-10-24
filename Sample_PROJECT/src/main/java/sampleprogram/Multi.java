package sampleprogram;

public class Multi {
	public static void main(String args[])
	{
		int ar[][]=new int[2][3];
		int i,j;
		ar[0][0]=1;
		ar[0][1]=2;
		ar[0][2]=3;
		ar[1][0]=4;
		ar[1][1]=5;
		ar[1][2]=6;
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
