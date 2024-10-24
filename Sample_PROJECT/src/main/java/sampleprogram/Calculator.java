package sampleprogram;

public class Calculator {
	public static void main(String args[])
	{
		int a=1,n1=6,n2=2,result;
		System.out.println("CALCULATOR");
		switch(a)
		{
			
		case 1:
				result=n1+n2;
			System.out.println("sum is "+result);break;
		case 2:
				result=n1-n2;
			System.out.println("Difference is "+result);break;
		case 3:
			result=n1*n2;
		System.out.println("Product is "+result);break;
		case 4:
			result=n1/n2;
		System.out.println("Quotient is "+result);break;		
		default:System.out.println("Invalid");
		}
	}

}
