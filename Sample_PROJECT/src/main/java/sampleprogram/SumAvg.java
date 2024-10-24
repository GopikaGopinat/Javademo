package sampleprogram;

public class SumAvg {
	static int  sum,avg;
	public static void sum(int a,int b)
	{
		sum=a+b;
		System.out.println(sum);
	}
	public static int average()
	{
		avg=sum/2;
		return avg;
	}
	public static void main(String args[])
	{
		SumAvg.sum(20,10);
		int c=SumAvg.average();
		System.out.println(c);
		
	}

}
