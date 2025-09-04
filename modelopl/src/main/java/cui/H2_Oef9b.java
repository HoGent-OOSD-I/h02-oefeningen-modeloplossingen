package cui;

import java.util.Scanner;

public class H2_Oef9b 
{
    public static void main (String[] args)
    {
    	new H2_Oef9b().bepaalAantalEvenEnDeelbaarDoor3();
    }   	
    	
    private void bepaalAantalEvenEnDeelbaarDoor3()
	{
		Scanner invoer = new Scanner (System.in);
        int getal, aantalEven = 0, aantalDeelbaarDoor3 = 0;
        
        for (int teller = 1;teller <= 5;teller++)
        {
            System.out.printf("Geef getal %d in: ", teller);
            getal = invoer.nextInt();
            if (getal%2 == 0)
                aantalEven ++;
            if (getal%3 == 0)
                aantalDeelbaarDoor3 ++;
        }
        System.out.printf("Je gaf %d even getal%s en %d getal%s deelbaar door 3 in.%n", 
                aantalEven, aantalEven==1?"":"len", aantalDeelbaarDoor3, aantalDeelbaarDoor3==1?"":"len");
    }
}
