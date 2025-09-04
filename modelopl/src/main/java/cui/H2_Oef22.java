package cui;

import java.util.Scanner;

public class H2_Oef22
{
	    public static void main(String [] args)
	    {
	    	new H2_Oef22().bepaalOpEenNaGrootste();
	    }
	        
	    private void bepaalOpEenNaGrootste()
		{
			int getal, grootste = Integer.MIN_VALUE, opEenNa = Integer.MIN_VALUE;
	        	        
	        for (int teller = 1;teller <= 10;teller++)
	        {
	            getal = geefGetal(teller);
	            if (getal > grootste)
	            {
	            	opEenNa = grootste;
	                grootste = getal;
	            }
	            else
	                if (getal>opEenNa && getal<grootste)
	                	opEenNa = getal;
	            
	        }
	        if (opEenNa != Integer.MIN_VALUE) 
	        	System.out.printf("%nHet op één na grootste getal is %d%n", opEenNa);
	    }
	    
		private int geefGetal(int teller)
		{
			Scanner input = new Scanner(System.in);
			System.out.printf("Geef getal %d in: ",teller);
			return input.nextInt();
		}
}
