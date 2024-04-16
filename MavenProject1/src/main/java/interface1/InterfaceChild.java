package interface1;

public class InterfaceChild implements InterfaceExample
{

	public static void main(String[] args)
	{
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		//InterfaceName objectname=new ClassName();
		InterfaceExample obj2=new InterfaceChild();
		obj2.display();
	}

	@Override
	public void display() 
	{
		int c=a+b;
		System.out.println("Sum="+c);
		
	}
	
	public void display2()
	{
		System.out.println("Hello");
	}

}
