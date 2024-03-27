package sampleprogram;

public class AddConst
{
	int sum;
	public AddConst(int a, int b)
	{
		sum=a+b;
		this.display();
	}
	
	public void display()
	{
		
	
		System.out.println("Sum = "+sum);
	}
	

	public static void main(String[] args)
	{
		AddConst obj=new AddConst(20,30);
		
		
	}

}
