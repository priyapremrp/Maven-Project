package polymorphism2;

public class Offseason extends Onseason
{
	
	public void discount()
	{
		super.discount();
		d=(price*85)/100;
		System.out.println("Price after 15% off season discount="+d);
	}

	public static void main(String[] args) 
	{
		Offseason obj =new Offseason();
		obj.discount();

	}

}
