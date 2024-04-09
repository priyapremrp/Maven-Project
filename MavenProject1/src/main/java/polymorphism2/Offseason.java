package polymorphism2;

import java.util.Scanner;

public class Offseason extends Onseason
{
	
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose a season:");
		System.out.println("1.On season");
		System.out.println("2.Off season");
		
		
		int s=sc.nextInt();
		switch (s)
		{
		
		case 1:
				
		super.discount();
		break;
		
		case 2:
			
		d=(price*85)/100;
		System.out.println("Price after 15% off season discount="+d);
		break;
		
	    }
	}

	public static void main(String[] args) 
	{
		Offseason obj =new Offseason();
		obj.discount();

	}

}
