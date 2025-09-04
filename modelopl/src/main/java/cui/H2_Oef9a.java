package cui;
 
import java.util.Scanner;

public class H2_Oef9a
{
    public static void main(String[] args)
    {
    	new H2_Oef9a().berekenSomVan5Getallen();
    }
    
    private void berekenSomVan5Getallen()
	{
		int getal, som = 0;
        Scanner input = new Scanner(System.in);

        for (int aantal=1;aantal <= 5;aantal++)
        {
            System.out.printf("Geef getal %d: ", aantal);
            getal = input.nextInt();
            som += getal;
        }
        System.out.printf("De som van de getallen = %d%n", som);
    }
}
