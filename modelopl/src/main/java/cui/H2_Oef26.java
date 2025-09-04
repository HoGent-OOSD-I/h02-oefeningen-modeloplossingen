package cui;

import java.util.Scanner;

public class H2_Oef26
{ 
	public static void main(String[] args)
	{
		new H2_Oef26().geefAantalWijzigingenInReeks();
	}
		
	private void geefAantalWijzigingenInReeks() {
		int getal, aantal = 0;

		getal = geefGetal();

		while (getal != 1) {
			if (getal % 2 == 0) {
				getal /= 2;
			    //aantal++;
			}
			else {
				//getal = (getal * 3) + 1;
				getal *= 3;
				getal++;
				//aantal++;
			}
			aantal++;
		}
		System.out.printf("Het getal wijzigt %d %s%n", 
				aantal, aantal == 1 ? "keer" : "keren");
	}

	private int geefGetal() {
		Scanner invoer = new Scanner(System.in);
		int getal;
		do {
			System.out.print("Geef een strikt positief geheel getal in: ");
			getal = invoer.nextInt();
		} while (getal <= 0);
		return getal;
	}
}
