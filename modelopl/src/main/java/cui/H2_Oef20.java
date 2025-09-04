package cui;

import java.util.Scanner;

public class H2_Oef20
{
    public static void main (String[] args)
    {
    	new H2_Oef20().geefGemiddeldeMax10Getallen();
    }
    	
    private void geefGemiddeldeMax10Getallen()
	{
		int getal, aantal = 0, totaal=0;
        
		getal = leesGetalIn();
        while (getal !=-1 && aantal < 10)
        {
            // verwerk getal
            totaal += getal;
            aantal++;
            if (aantal != 10) 
            // volgend inlezen 
            	getal = leesGetalIn();
        }
        if (aantal != 0)
            System.out.printf("Gemiddelde is %.2f%n", (double) totaal / aantal);
        else
            System.out.println("Er werden geen getallen ingegeven!"); 
    }
    
    private int leesGetalIn()
    {
        Scanner invoer = new Scanner(System.in);
        System.out.print("Geef een getal, -1 om te stoppen, max 10 getallen: ");
        return invoer.nextInt();
    }
}
