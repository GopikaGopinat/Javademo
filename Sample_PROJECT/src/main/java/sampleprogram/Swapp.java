package sampleprogram;

public class Swapp {
	public static void main(String args[])
	{
		int a=10,b=40;
		System.out.println("Before swapping values are:" +" " +a +" " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping values are:" +" "+a +" " +b);
	}
}
