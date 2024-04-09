package aggregation;

public class Child 
{
	int c;
	Parent d;
	
	public Child(int c,Parent d)
	{
		this.d=d;
		this.c=c;
	}
	
	public void display()
	{
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Parent obj=new Parent(10,20);
		Child obj1=new Child(30,obj);
		obj1.display();
	}

}
