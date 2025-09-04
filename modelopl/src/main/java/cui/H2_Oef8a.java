package cui;

public class H2_Oef8a 
{
    public static void main (String [] args)
    {
    	new H2_Oef8a().toonSom();
    }
    
    private void toonSom()
	{
		int som = 0;
           
        for (int getal = 12 ; getal <= 500; getal+=12)
        {
        	som += getal;
        }
           
        /*
         * NIET:
         * 
         * for (int getal = 1; getal <= 500; getal++)
         * 		if (getal % 12 == 0) // controle wordt 500x uitgevoerd!
         * 			som += getal;
         */
        
        System.out.printf("Som van getallen tussen 1 en 500 die deelbaar zijn door 12: %d%n", som);
    }
}
