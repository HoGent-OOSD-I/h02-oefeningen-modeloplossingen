package cui;

import java.util.Scanner;

public class H2_Oef23
{
	public static void main(String[] args)
	{
		new H2_Oef23().bepaalDelers();
	}

    private void bepaalDelers() {

        // STAP 1: lees getal met invoercontrole
        int getal = geefGetal();

        // STAP 2: 1 heeft maar 1 deler -> toon melding
        if (getal == 1)
            System.out.printf("%d kan alleen gedeeld worden door 1%n", getal);
        else {
            // STAP 3: ander getal: welke delers heeft dit getal?

            // 1 is sowieso een deler
            int aantalDelers = 1;
            String delers = "1  ";

            // zoeken naar de andere delers
            for (int deler = 2; deler <= getal / 2; deler++) {
                if (getal % deler == 0) {
                    delers += String.format("%d  ", deler);
                    aantalDelers++;
                }
            }

            // het getal zelf is sowieso een deler
            delers += String.format("en  %d", getal);
            aantalDelers++;

            // STAP 4: toon delers op het scherm
            System.out.printf("%d heeft %d delers namelijk:%n%s ", getal, aantalDelers, delers);
        }
    }

    private int geefGetal() {
        Scanner invoer = new Scanner(System.in);
        int getal;
        boolean isGeldig;

        do {
            System.out.print("Geef een strikt positief geheel getal in: ");
            getal = invoer.nextInt();
            isGeldig = getal > 0;
        } while (!isGeldig);

        return getal;
    }

}
