package cui;

import java.util.Scanner;

public class H2_Oef29 
{
	public static void main(String[] args) 
	{
		new H2_Oef29().geefAantalGevolgdDoorKleiner();
	}
		
	private void geefAantalGevolgdDoorKleiner()
	{
		int getal, vorig, aantalKleiner = 0;
		
		getal = geefGetal();
		vorig = getal;
		while (getal != -2000)
		{
			if (vorig > getal)
				aantalKleiner++;

			vorig = getal;
			getal = geefGetal();
		}
		System.out.printf("Het aantal getallen dat direct gevolgd wordt door een kleiner getal is %d%n", aantalKleiner);
	}

	private int geefGetal()
	{
		Scanner invoer = new Scanner(System.in);
		System.out.print("Geef een geheel getal (-2000 om te stoppen): ");
		return invoer.nextInt();
	}	
}
