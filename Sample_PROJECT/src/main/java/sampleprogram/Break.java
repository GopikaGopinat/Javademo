package sampleprogram;

public class Break {
	public static void main(String args[])
	{
		int i=1;
		for(i=1;i<=10;i++)
		{
			if(i==5)
			{
			//	break;
				continue;
			}
			System.out.println(i);
		}
	}

}
