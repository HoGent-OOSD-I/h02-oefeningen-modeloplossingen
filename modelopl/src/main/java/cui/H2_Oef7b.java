package cui;

public class H2_Oef7b
{
	public static void main (String[] args)
	{
		new H2_Oef7b().callMysteryMethod();
	}
	
	private void callMysteryMethod()
	{
		for ( int count = 1; count <= 10 ;count = count + 1 )
		{
			System.out.println(
				count % 2 == 1 ? "****" : "++++++++" );
			
		}
	}
}

