package cui;

import java.util.Scanner;

public class H2_Oef11
{
    public static void main(String[] args)
    {
        new H2_Oef11().vermeerderVerminder();
    }

    private void vermeerderVerminder()
    {
        int getal;

        getal = geefGetal();

        //verwerk tot uitvoer
        if (getal > 0)
            System.out.printf("Het ingegeven getal was strikt positief en werd verminderd met 10.%nHet heeft nu de waarde %d.%n",
                    getal - 10);
        else if (getal < 0)
            System.out.printf("Het ingegeven getal was negatief en werd vermeerderd met 10.%nHet heeft nu de waarde %d.%n",
                    getal + 10);
        else // getal = 0
            System.out.printf("Het ingegeven getal was nul en werd vermeerderd met 1.%n");
    }

    private int geefGetal()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een getal in: ");
        return input.nextInt();
    }
}
