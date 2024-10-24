package sampleprogram;

public class Average {
	static int a=20,b=10,avg,res;
	public static void sum()
	{
		res=a+b;
		System.out.println("Sum is "+res);
	}
	public static void avg()
	{
		avg=res/2;
		System.out.println("Average is "+avg);	
		}
	public static void main(String args[]) 
	{
		Average.sum();
		Average.avg();
	}

}
