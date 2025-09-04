package cui;
import java.util.Scanner;

public class H2_Oef14
{
	public static void main(String[] args)
	{
		new H2_Oef14().bepaalEvenOfOneven();
	}	
	
	private void bepaalEvenOfOneven()
	{
		int getal = geefGetal();

		if (getal % 2 == 0)
			System.out.printf("Het ingevoerde getal %d is een even getal%n", getal);
		else
			System.out.printf("Het ingevoerde getal %d is een oneven getal%n", getal);
	}
	
	private int geefGetal()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een geheel getal in: ");
		return input.nextInt();
	}
}
