package sampleprogram;

public class Names {
	static String s;
	static int age;
	public static void details()
	{
		 s="Gopika";
		age =21;
	}
	public static void display()
	{
		System.out.println("Name is "+s);
		System.out.println("Age is "+age);
	}
	public static void main(String args[])
	{
		Names.details();
		Names.display();
		
	}

}
