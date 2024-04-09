package superkeyword2;


public class Divisible extends Addition
{

	int s;
	
	public void div()
	{
		super.sum();
		s=super.s;
		System.out.println("sum="+super.s);
		
		if(super.s%10==0)
		{
			System.out.println("NUmber is divisible by 10");
		}
		else
		{
			System.out.println("Number is not divisible by 10");
		}
	}

	public static void main(String[] args)
	{
		
		Divisible d=new Divisible();
		d.div();
		
	}

}
