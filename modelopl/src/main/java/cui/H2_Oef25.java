package cui;

import java.util.Scanner;

public class H2_Oef25
{
    public static void main(String[] args)
    {
    	new H2_Oef25().geefGetallenDeelbaarDoorGekozenDeler();
    }	
    
private Scanner invoer = new Scanner(System.in);
    
    private void geefGetallenDeelbaarDoorGekozenDeler()
	{
		int getal, deler;
        int teller = 1, aantal = 0;
        
        deler = geefDeler();
        
        getal = geefGetal(teller);
        
        while (getal != -1) 
        {          
            if (getal % deler == 0) 
              aantal++;
            
            getal = geefGetal(++teller);
        }
        
        System.out.printf("%nEr %s %d getal%s deelbaar door %d%n",
        		aantal == 1? "is":"zijn",aantal, aantal == 1? "":"len",deler);
    }
    
    private int geefDeler() {
    	int deler;
    	do
        {
	        System.out.print("Geef een strikt positieve deler in: ");
	        deler = invoer.nextInt();
	    }
	    while (deler <= 0);
    	      //!(deler > 0)
    	return deler;
	}

	private int geefGetal(int teller)
    {
    	int getal;
        do
        {
        	System.out.printf("Geef positief getal %d in (of stop met -1): ", 
        			teller);
        	getal = invoer.nextInt();
        }
        while (getal < -1);	
           //!(getal == -1 || getal >= 0   ==> getal >= -1)
        return getal;
    }
}
