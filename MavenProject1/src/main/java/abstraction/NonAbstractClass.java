package abstraction;

public class NonAbstractClass extends AbstractClassExample
{

	public static void main(String[] args) 
	{
		
		NonAbstractClass obj=new NonAbstractClass();
		obj.display();
		obj.display2();
		AbstractClassExample.display3();
		
	}

	@Override
	public void display()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum="+c);
		
	}

}
