package cui;

import java.util.Scanner;

public class H2_Oef24
{
    public static void main(String [] args)
    {
    	new H2_Oef24().geefAantalDeelbaarDoor2Door3EnDoor6();
    }
    
	private void geefAantalDeelbaarDoor2Door3EnDoor6()
	{
        int getal, aantalDeelbaarDoor2 = 0, aantalDeelbaarDoor3 = 0, aantalDeelbaarDoor6 = 0;
       
        getal = geefGetal();
        
        while (getal != 0)
        {
            if (getal%6 == 0)
            {
            	aantalDeelbaarDoor6++; 
                aantalDeelbaarDoor2++;
                aantalDeelbaarDoor3++;  
            }
            else if (getal%3 == 0)
                aantalDeelbaarDoor3++;  
            else if (getal%2 == 0)
                aantalDeelbaarDoor2++;       
            
            //nieuw getal inlezen
            getal = geefGetal();
        }

        printAantalDeelbaar(2, aantalDeelbaarDoor2);
        printAantalDeelbaar(3, aantalDeelbaarDoor3);
        printAantalDeelbaar(6, aantalDeelbaarDoor6);
    }
	
	private int geefGetal()
	{
        Scanner invoer = new Scanner(System.in);
        int getal;
        
        do //controle op invoer
        {
            System.out.print("Geef een positief geheel getal (stoppen met 0): ");
            getal = invoer.nextInt();
        }
        while (getal < 0);
        
        return getal;
	}
	
	private void printAantalDeelbaar(int deler, int aantalDeelbaar)
	{
        System.out.printf("Er %s %d getal%s deelbaar door %d%n",
                aantalDeelbaar == 1 ? "is" : "zijn", 
                aantalDeelbaar, aantalDeelbaar == 1 ? "" : "len", deler); 
	}
}
