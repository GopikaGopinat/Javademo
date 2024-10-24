
package sampleprogram;

public class MethodOverload {
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void add(float a,int b)
	{
		float d=b-a;
		System.out.println(d);
		}
	public static void main(String args[])
	{
		MethodOverload.add(10,20);
		MethodOverload.add(10.2f,20);
	}

}
