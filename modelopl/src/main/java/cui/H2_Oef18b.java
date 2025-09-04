package cui;

import java.util.Scanner;

public class H2_Oef18b
{
    public static void main (String [] args)
    {
        new H2_Oef18b().controleerInvoer2Getallen();
    }

    private void controleerInvoer2Getallen()
    {
        int getal1, getal2;
        Scanner invoer = new Scanner (System.in);

        do
        {
            System.out.print("Geef een eerste getal, niet 1000 en niet deelbaar door 12: ");
            getal1 = invoer.nextInt();
        }
        while (getal1 == 1000 || getal1 % 12 == 0);
        // OF while (!(getal1 != 1000 && getal1 % 12 != 0))

        do
        {
            System.out.print("Geef een tweede getal, groter dan eerste getal: ");
            getal2 = invoer.nextInt();
        }
        while (getal2 <= getal1);
        // OF while (getal1 >= getal2);
        // OF while (!(getal2 > getal1));
    }
}
