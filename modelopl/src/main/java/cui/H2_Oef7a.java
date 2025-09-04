package cui;

public class H2_Oef7a
{
	public static void main(String[] args)
	{
		new H2_Oef7a().callMysteryMethod();
	}
	
	private void callMysteryMethod()
	{
		int y, x = 1, total = 0;

		for ( ; x <= 10 ; x = x+1)
		{
			y = x * x;
			System.out.printf("%d%n", y);
			total = total + y;
		}

		System.out.printf("Total is %d%n", total);
	}
}
