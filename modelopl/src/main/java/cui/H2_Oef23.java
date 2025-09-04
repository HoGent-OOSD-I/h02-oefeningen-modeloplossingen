package cui;

import java.util.Scanner;

public class H2_Oef23
{
	public static void main(String[] args)
	{
		new H2_Oef23().bepaalDelers();
	}
		
	private void bepaalDelers() {

		int getal = geefGetal();

		System.out.printf("De delers zijn: 1");

		for (int deler = 2; deler <= getal / 2; deler++) {
			if (getal % deler == 0) {
				System.out.printf("%d ", deler);
			}
		}
		if (getal != 1)
			System.out.printf(" en %d", getal);
		System.out.println();
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
