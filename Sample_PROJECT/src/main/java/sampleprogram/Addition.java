package sampleprogram;

public class Addition {
	public static  float add()
	{
		int a=5;
		float b=2.5f,sum;
		sum=a+b;
		return sum;
	}
	public static void main(String args[])
	{
		float x=Addition.add();
		System.out.println(x);
	}
}
