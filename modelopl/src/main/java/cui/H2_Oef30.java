package cui;

import java.util.Scanner;

public class H2_Oef30 
{
	public static void main(String[] args) 
    {
		new H2_Oef30().geefAantalPriem();
    }
		
	private void geefAantalPriem()
	{
		int getal, aantalPriem = 0;
		boolean priem = true;

		getal = geefPositiefGetal();
		
		while (getal != 0)
		{
			if (getal == 1)
				priem = false;
			else
            {
				priem = !isDeelbaar(getal);
			}
				
			System.out.printf("%d is %s priemgetal!%n", getal, priem? "EEN" : "GEEN");
			if (priem) 
			     aantalPriem++;
			
			getal = geefPositiefGetal();
		}
		System.out.printf("Het aantal priemgetallen is %d%n", aantalPriem);
    }

	private boolean isDeelbaar(int getal) {
		for (int mogelijkeDeler = 2; mogelijkeDeler <= getal/2; mogelijkeDeler++) {
			if (getal % mogelijkeDeler == 0) {
				return true;
			}
		}
		return false;
	}

	private int geefPositiefGetal()
	{
		Scanner scanner = new Scanner(System.in);
		int getal;
		do
		{
			System.out.print("Geef een pos geheel getal (0 om te stoppen): ");
			getal = scanner.nextInt();
		}
		while (getal < 0);
		   //!(getal >= 0)
		return getal;
	}
}

