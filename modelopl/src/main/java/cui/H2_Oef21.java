package cui;

import java.util.Scanner;

public class H2_Oef21
{
    public static void main(String [] args)
    {
    	new H2_Oef21().maakTabelMetAfstandSnelheidEnTijd();
    }
        	
    private void maakTabelMetAfstandSnelheidEnTijd()
  	{
  		//afstand inlezen, tabel met afstand, snelheid en tijd weergeven
          int afstand, uur, minuut;
          
          afstand = leesAfstand();
          
          for (int snelheid=40; snelheid<=140; snelheid +=10)
          {
              uur = afstand / snelheid;                  //gehele deling
              minuut = afstand % snelheid * 60 / snelheid ; //omgerekend naar 60 minuten in 1 uur
              System.out.printf("%3d km%10d km/u%8d u %02d min%n", 
              		afstand, snelheid, uur, minuut);
          }
    }

  	private int leesAfstand() {
  		Scanner invoer = new Scanner (System.in);
          int afstand;
  		do
          {
          	System.out.print("Geef een afstand in kilometer (strikt positief geheel getal): ");
          	afstand = invoer.nextInt();
          }
          while (afstand <= 0);
             //!(afstand > 0)
  		return afstand;
  	}
}
