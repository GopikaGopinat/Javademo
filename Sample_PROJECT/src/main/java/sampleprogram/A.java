
//Single inheritance
/*package sampleprogram;
public class A {
	int a=80,b=20;
	public void sum()
	{ 
		int sum=a+b;
		System.out.println(sum);	
	}
}*/

//multilevel inheritance

package sampleprogram;
public class A {
	public void student(String name,int id)
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
	}
	public static void main(String[] args) {
		A sc=new A();
		sc.student("Gopika",123);
		sc.mark(20,30,40);
		
		
	}
	
	
	
}

