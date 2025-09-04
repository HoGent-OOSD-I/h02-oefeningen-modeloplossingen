package cui;

import java.util.Scanner;

public class H2_Oef18a
{
    public static void main (String [] args)
    {
        new H2_Oef18a().controleerInvoerStriktNegatiefOneven();
    }

    private void controleerInvoerStriktNegatiefOneven()
    {
        Scanner invoer = new Scanner (System.in);
        int getal;

        do
        {
            System.out.print("Geef een strikt negatief oneven getal: ");
            getal = invoer.nextInt();
        }
        while (getal % 2 == 0 || getal >= 0);
        // OF while (!(getal % 2 != 0 && getal < 0))
    }
}
