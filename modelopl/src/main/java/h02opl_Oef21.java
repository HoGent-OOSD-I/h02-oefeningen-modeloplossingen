void main() {
int getal, aantal = 0, totaal=0;
    
    getal = leesGetalIn();
    while (getal !=-1 && aantal < 10)
    {
        // verwerk getal
        totaal += getal;
        aantal++;
        if (aantal != 10) 
        // volgend inlezen 
            getal = leesGetalIn();
    }
    if (aantal != 0)
        IO.print(String.format("Gemiddelde is %.2f%n", (double) totaal / aantal));
    else
        IO.println("Er werden geen getallen ingegeven!"); 
}//einde main

private int leesGetalIn()
{
    return Integer.parseInt(IO.readln("Geef een getal, -1 om te stoppen, max 10 getallen: "));
}//einde leesGetalIn

