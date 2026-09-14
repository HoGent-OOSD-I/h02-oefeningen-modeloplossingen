void main() {
        //	int grootste = Integer.MIN_VALUE, kleinste = Integer.MAX_VALUE;
    int getal;

    getal = geefGetal();
    int grootste = getal, kleinste = getal;
    while (getal != 0)
    {
        if (getal > grootste)
            grootste = getal;
        else if (getal < kleinste) // Oplossing 1 geen else
            kleinste = getal;
        getal = geefGetal();
    }

    if (grootste == 0) // OF if (kleinste == 0) // Oplossing 1 if (grootste == Integer.MIN_VALUE)
        IO.print(String.format("Er werden geen geldige getallen ingevoerd!%n"));
    else
        IO.print(String.format("Het grootste van alle ingevoerde getallen is %d.%nHet kleinste is %d.%n", grootste, kleinste));
}//einde main

int geefGetal()
{
    return Integer.parseInt(IO.readln("Geef een getal (0 om te stoppen): "));
}//einde geefGetal
