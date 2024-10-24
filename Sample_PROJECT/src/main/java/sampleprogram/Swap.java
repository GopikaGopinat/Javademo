package sampleprogram;

public class Swap {
	public static void main(String args[])
	{
		int a=20,b=30,temp;
		System.out.println("Before swapping values are:" +" "+a +" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping values are:" +" " +a +" " +b);
	}

}
