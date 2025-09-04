package cui;

import java.util.Scanner;

public class H2_Oef12
{
    public static void main(String[] args)
    {
    	new H2_Oef12().bepaalStadBijPostcode();
    }
    
    private void bepaalStadBijPostcode()
    {
        //lees postnr in, "zoek op in tabel", druk stad of foutboodschap
    	int postcode;
    	String stad;
    	
        postcode = leesPostcode();
        
        stad = switch(postcode)
        {
            case 9300 -> "Aalst";
            case 2000 -> "Antwerpen" ; 
            case 1000 -> "Brussel";
            case 9200 -> "Dendermonde"; 
            case 9000 -> "Gent"; 
            case 8500 -> "Kortrijk" ; 
            case 9700 -> "Oudenaarde"; 
            case 2300 -> "Turnhout"; 
            default -> "";
        };
        
        if (!stad.isEmpty())
            System.out.printf("Postnummer %d komt overeen met de stad %s%n", postcode, stad);
        else
        	System.out.printf("Postnummer %d bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen%n", postcode);
    }

	private int leesPostcode() {
		Scanner invoer = new Scanner (System.in);
		int postcode;
		do
        {
        	System.out.print("Geef een postcode (4 cijfers): ");
        	postcode = invoer.nextInt();
        } 
        while (postcode < 1000 || postcode > 9999);
		   //!(postcode >= 1000 && postcode <= 9999)
		return postcode;
	}
}
