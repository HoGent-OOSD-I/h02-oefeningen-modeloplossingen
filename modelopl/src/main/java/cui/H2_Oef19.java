package cui;

public class H2_Oef19
{
    public static void main (String[] args)
    {
    	new H2_Oef19().bepaalAantalJaarTot1000Leeuwen();
    }
    	
    private void bepaalAantalJaarTot1000Leeuwen()
	{
		int aantalLeeuwen = 50;
		int groei = 15;
        int jaar = 0;
   
        do
        {
            aantalLeeuwen += aantalLeeuwen * groei / 100; 
            jaar++;
        } while (aantalLeeuwen<=1000);
        
    	System.out.printf("1000 leeuwen na %d jaar%n", jaar);
        
    }
}
