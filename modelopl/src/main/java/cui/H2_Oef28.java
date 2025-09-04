package cui;

import java.util.Scanner;

public class H2_Oef28 
{
	public static void main(String[] args)
	{
		new H2_Oef28().bepaalAantalPerKeuze();
	}
	
	private void bepaalAantalPerKeuze()
	{
		int aantal = 1, aantal1 = 0, aantal2 = 0, aantal3 = 0, aantal4 = 0;
		int getal;
		
		getal = geefAntwoord(aantal);
		
		while (getal != 0) 
		{
			switch (getal)
			{
			case 1 -> aantal1++;
			case 2 -> aantal2++;
			case 3 -> aantal3++;
			case 4 -> aantal4++;
			}
			aantal++;
			getal = geefAntwoord(aantal);
		}
		System.out.printf("Aantal 1 = %d%nAantal 2 = %d%nAantal 3 = %d%nAantal 4 = %d%n",
				aantal1, aantal2, aantal3, aantal4);
	}
	
	private int geefAntwoord(int aantal)
	{
		Scanner invoer = new Scanner(System.in);
		int antwoord;
		boolean ongeldig;
		do
		{
			System.out.printf("Geef antwoord %d in (1, 2, 3 of 4), STOP met 0: ", aantal);
			antwoord = invoer.nextInt();
			ongeldig = antwoord < 0 || antwoord > 4;
			if (ongeldig)
				System.out.printf("Foutieve waarde! Probeer opnieuw!%n");
		}while(ongeldig);
		   //!(antwoord >=0 && antwoord <= 4)
		return antwoord;
	}

}