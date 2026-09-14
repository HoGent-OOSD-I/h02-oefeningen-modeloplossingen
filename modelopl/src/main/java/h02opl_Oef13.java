void main() {
    //invoer
    int getal1 = leesGetal("Geef eerste getal in: ");

    int getal2 = leesGetal("Geef tweede getal in: ");

    int getal3 = leesGetal("Geef derde getal in: ");

    //verwerk
    int som = getal1 + getal2 + getal3;
    int gemiddelde = som / 3;
    int rest = som % 3;

    int grootsteGetal = getal1;
    if (getal2 > grootsteGetal)
        grootsteGetal = getal2;
    if (getal3 > grootsteGetal)
        grootsteGetal = getal3;

    //uitvoer
    IO.print(String.format("Van de ingevoerde getallen %d, %d en %d%n",
                        getal1, getal2, getal3));
    IO.print(String.format("%s%d%n%s%d%n%s%d%n%s%d%n",
            "is de som ", som,
            "het gemiddelde ", gemiddelde,
            "de rest ", rest,
            "en het grootste getal ", grootsteGetal));
}

int leesGetal(String vraag)
{

    return Integer.parseInt(IO.readln(vraag));
}//einde leesGetal

