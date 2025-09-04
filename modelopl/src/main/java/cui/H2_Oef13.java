package cui;
import java.util.Scanner;

public class H2_Oef13
{ 
    public static void main(String[] args) 
    { 
       new H2_Oef13().bepaalQuotientEnRest();
    }

    private Scanner input = new Scanner(System.in);
    
    private void bepaalQuotientEnRest()
	{
		int teller, noemer, deling, rest;
        
        teller = geefTeller();
        noemer = geefNoemer();
        
        deling = teller/noemer;
        rest = teller % noemer;
        
        System.out.printf("%d/%d = %d%nrest =  %d%n%n",
        		                 teller,noemer, deling, rest);
       
        if (rest == 0) 
            System.out.printf("vereenvoudigde breuk = %d / 1%n", deling);
    }

	private int geefNoemer() {
		int noemer;
		do {
			System.out.print("Geef de noemer in van de breuk: ");
			noemer = input.nextInt();
		} while (noemer == 0);
		return noemer;
	}

	private int geefTeller() {
		System.out.print("Geef de teller in van de breuk: ");
        return input.nextInt();
	} 
} 
