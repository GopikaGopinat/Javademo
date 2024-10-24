package sampleprogram;

public class AddTest {
	public static int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		int c=AddTest.add(10,20);
		System.out.println(c);
		
	}

}
