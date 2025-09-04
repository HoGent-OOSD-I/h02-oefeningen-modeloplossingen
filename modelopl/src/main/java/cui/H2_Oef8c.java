package cui;

public class H2_Oef8c 
{
    public static void main (String [] args)
    {
    	new H2_Oef8c().toonAlfabet();
    }
    	 	
    private void toonAlfabet()
	{
    	for (char karakter = 'a'; karakter <= 'z' ; karakter++)
        {
            System.out.printf ("%c ", karakter);
        }
        System.out.println();  
    }
}


