package polymorphism;

public class Child extends Parent
{
	
	public void sample()
	{
		super.sample();
		d=a-b;
		System.out.println(d);
	}

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.sample();
		
				

	}

}
