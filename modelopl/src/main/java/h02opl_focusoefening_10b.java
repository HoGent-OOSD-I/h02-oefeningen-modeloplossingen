void main() {
    int getal1, getal2;

    do
    {
        getal1 = Integer.parseInt(IO.readln("Geef een eerste getal, niet 1000 en niet deelbaar door 12: "));
    }
    while (getal1 == 1000 || getal1 % 12 == 0);
    // OF while (!(getal1 != 1000 && getal1 % 12 != 0))

    do
    {
        getal2 = Integer.parseInt(IO.readln("Geef een tweede getal, groter dan eerste getal: "));
    }
    while (getal2 <= getal1);
    // OF while (getal1 >= getal2);
    // OF while (!(getal2 > getal1));
}//einde main
