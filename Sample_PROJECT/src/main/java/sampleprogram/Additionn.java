package sampleprogram;

public class Additionn {
	static int sum,a,b;
	public static int add(int a,int b)
	{
		sum=a+b;
		return sum;
	}
	public static void main(String args[])
	{
		sum=Additionn.add(50,50);
	    System.out.println(sum);
	
	
	}
}
