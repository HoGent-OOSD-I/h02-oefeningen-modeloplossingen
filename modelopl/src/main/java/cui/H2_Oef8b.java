package cui;

public class H2_Oef8b
{
    public static void main (String [] args)
    {
    	new H2_Oef8b().toonOnevenGetallen();
    }
    
    private void toonOnevenGetallen()
	{
		int teller = 0;
        
        for (int onevenGetal = 51; onevenGetal >=1 ; onevenGetal -=2)
        {
            System.out.printf("%2d  ", onevenGetal);
            teller++;
            if (teller % 5 == 0)
                System.out.println();
        }
        System.out.println();
    }
}
