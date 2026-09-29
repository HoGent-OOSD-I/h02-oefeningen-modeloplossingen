void main() {
    
    int getal;

    do
    {
        getal = Integer.parseInt(IO.readln("Geef een strikt negatief oneven getal: "));
    }
    while (getal % 2 == 0 || getal >= 0);
    // OF while (!(getal % 2 != 0 && getal < 0))
}//einde main
