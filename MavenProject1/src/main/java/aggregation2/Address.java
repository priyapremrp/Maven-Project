package aggregation2;

public class Address
{
	Student s;
	String a;
	
	public Address(String a, Student s)
	{
		this.s=s;
		this.a=a;
	}
	
	public void display()
	{
		System.out.println("Name="+s.name);
		System.out.println("Roll No="+s.n);
		System.out.println("Address="+a);
	}

	public static void main(String[] args)
	{
		Student obj=new Student("Priya",10);
		Address obj1=new Address("TVM",obj);
		obj1.display();
		
	}

}
