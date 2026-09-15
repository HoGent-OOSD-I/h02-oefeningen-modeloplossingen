void main() {
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

int geefGetal()
{
   int getal;
    
    do //controle op invoer
    {
        getal = Integer.parseInt(IO.readln("Geef een positief geheel getal (stoppen met 0): "));
    }
    while (getal < 0);
    
    return getal;
}

void printAantalDeelbaar(int deler, int aantalDeelbaar)
{
    IO.print(String.format("Er %s %d getal%s deelbaar door %d%n",
            aantalDeelbaar == 1 ? "is" : "zijn", 
            aantalDeelbaar, aantalDeelbaar == 1 ? "" : "len", deler));
}//einde print...
