package finalkeyword;

public class FinalKeyword 
{
	final int i=10;
	
	public final void display()
	{
		int x=i+i;
		System.out.println(x);
	}
	
	//public FinalKeyword()
	//{
		//i=20;
		//System.out.println(i);
	//}

	public static void main(String[] args) 
	{
		FinalKeyword obj=new FinalKeyword();
		obj.display();

	}

}
