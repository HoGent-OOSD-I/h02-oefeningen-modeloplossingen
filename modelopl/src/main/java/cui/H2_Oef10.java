package cui;

import java.util.Scanner;

public class H2_Oef10
{

    public static void main(String[] args)
    {
        new H2_Oef10().verwerk3Getallen();
    }

    private void verwerk3Getallen()
    {
        //invoer
        int getal1 = leesGetal("Geef eerste getal in: ");

        int getal2 = leesGetal("Geef tweede getal in: ");

        int getal3 = leesGetal("Geef derde getal in: ");

        //verwerk
        int som = getal1 + getal2 + getal3;
        int gemiddelde = som / 3;
        int rest = som % 3;

        int grootsteGetal = getal1;
        if (getal2 > grootsteGetal)
            grootsteGetal = getal2;
        if (getal3 > grootsteGetal)
            grootsteGetal = getal3;

        //uitvoer
        System.out.printf("Van de ingevoerde getallen %d, %d en %d%n", getal1, getal2, getal3);
        System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n",
                "is de som ", som,
                "het gemiddelde ", gemiddelde,
                "de rest ", rest,
                "en het grootste getal ", grootsteGetal);
    }

    private int leesGetal(String vraag)
    {
        Scanner invoer = new Scanner(System.in);
        System.out.print(vraag);
        return invoer.nextInt();
    }
}
