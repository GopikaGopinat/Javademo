package sampleprogram;

public class Shape {
	static int l,b,r;
	static float a,area;
	public static void Area(int l,int b)
	{
		area=l*b;
		System.out.println("Area of rectangle is: "+area);
	}
	public static void Area(float a)
	{
		area=a*a;
		System.out.println("Area of square: "+area);
	}
	public static void Area(int r)
	{
		area=3.14f*r*r;
		System.out.println("Area of circle: "+area);
	}
	public static void main(String args[])
	{
	   Shape.Area(5,10);
	   Shape.Area(2.5f);
	   Shape.Area(3);
	}
}
