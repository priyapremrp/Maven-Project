package finalkeyword;

public class FinalKeyword2 extends FinalKeyword
{

	
	/*public final void display()
	{
		int x=i+i;
		System.out.println(x);
	}*/                            //Can't override final method

	public static void main(String[] args) 
	{
		FinalKeyword2 obj1 = new FinalKeyword2();
		obj1.display();

	}

}
