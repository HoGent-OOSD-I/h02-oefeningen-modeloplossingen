package cui;

import java.util.Scanner;

public class H2_Oef17b
{
    public static void main(String[] args)
    {
        new H2_Oef17b().bepaalGrootsteEnKleinste();
    }

    private void bepaalGrootsteEnKleinste()
    {
        //	int grootste = Integer.MIN_VALUE, kleinste = Integer.MAX_VALUE;
        int getal;

        getal = geefGetal();
        int grootste = getal, kleinste = getal;
        while (getal != 0)
        {
            if (getal > grootste)
                grootste = getal;
            else if (getal < kleinste) // Oplossing 1 geen else
                kleinste = getal;
            getal = geefGetal();
        }

        if (grootste == 0) // OF if (kleinste == 0) // Oplossing 1 if (grootste == Integer.MIN_VALUE)
            System.out.printf("Er werden geen geldige getallen ingevoerd!%n");
        else
            System.out.printf("Het grootste van alle ingevoerde getallen is %d.%nHet kleinste is %d.%n", grootste, kleinste);
    }

    private int geefGetal()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een getal (0 om te stoppen): ");
        return input.nextInt();
    }
}
