package cui;

import java.util.Scanner;

public class H2_Oef17a
{
    public static void main(String[] args)
    {
        new H2_Oef17a().bepaalGemiddeldeNegatieveGetallen();
    }

    private void bepaalGemiddeldeNegatieveGetallen()
    {
        int getal, aantal = 0;
        double gemiddelde = 0, som = 0;

        getal = geefGetal();
        while (getal != 0)
        {
            if (getal < 0)
            {
                som += getal;
                aantal++;
            }
            getal = geefGetal();
        }

        if (aantal != 0)
        {
            gemiddelde = som / aantal;
            System.out.printf("Het gemiddelde van alle negatieve getallen is %.1f%n", gemiddelde);
        } else
            System.out.printf("Er werden geen negatieve getallen ingevoerd!%n");
    }

    private int geefGetal()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een getal (0 om te stoppen): ");
        return input.nextInt();
    }
}
