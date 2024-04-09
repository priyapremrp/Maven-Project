package superkeyword;

public class ChildClass extends ParentClass
{
	//int a;
	
	public ChildClass()
	{
		super();
		System.out.println("HI");
	}
	
	public void display()
	{
		super.a=a;
		System.out.println("Hello");
		System.out.println(super.a);
		super.display1();
	}

	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.display();

	}

}
