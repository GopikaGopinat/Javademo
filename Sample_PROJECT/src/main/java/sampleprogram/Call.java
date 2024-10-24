package sampleprogram;

public class Call {
	static int a=6,b=2,result;
	public static void add()
	{
		result=a+b;
		System.out.println("Sum is "+result);
	}
	public static void sub()
	{
		result=a-b;
		System.out.println("Difference is "+result);
	}
	public static void mul()
	{
		result=a*b;
		System.out.println("Product is " +result);
	}
	public static void div()
	{
		result=a/b;
		System.out.println("Quotient is "+result);
	}
	public static void main(String args[])
	{
		Call.add();
		Call.sub();
		Call.mul();
		Call.div();
	}
	

}
