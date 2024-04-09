package superkeyword2;

import java.util.Scanner;

public class Addition 
{
	int a;
	int b;
	int s;
	
	public int sum()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("a = " +a);
		
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("b = " +b);

		s =a+b;
		return s;
	}

}
