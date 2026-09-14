void main() {

    int getal, aantal = 0;
    double gemiddelde = 0, som = 0;

    getal = geefGetal();
    while (getal != 0)
    {
        if (getal < 0)
        {
            som += getal;
            aantal++;
        }
        getal = geefGetal();
    }

    if (aantal != 0)
    {
        gemiddelde = som / aantal;
        IO.print(String.format("Het gemiddelde van alle negatieve getallen is %.1f%n", gemiddelde));
    } else
        IO.print(String.format("Er werden geen negatieve getallen ingevoerd!%n"));
}//einde main

int geefGetal()
{
    return Integer.parseInt(IO.readln("Geef een getal (0 om te stoppen): "));
}//einde geefGetal
