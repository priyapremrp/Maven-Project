package encapsulation;

public class Parent 
{
	private String  name;
	private int id;
	
	public void setter(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void getter()
	{
		System.out.println("Name="+name);
		System.out.println("ID="+id);
	}

}
