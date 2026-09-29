void main() {
    int getal;

    getal = geefGetal();

    //verwerk tot uitvoer
    if (getal > 0)
        IO.print(String.format("Het ingegeven getal was strikt positief en werd verminderd met 10.%nHet heeft nu de waarde %d.%n",
                getal - 10));
    else if (getal < 0)
        IO.print(String.format("Het ingegeven getal was negatief en werd vermeerderd met 10.%nHet heeft nu de waarde %d.%n",
                getal + 10));
    else // getal = 0
        IO.print(String.format("Het ingegeven getal was nul en werd vermeerderd met 1.%n"));
}//einde main

int geefGetal()
{
    return Integer.parseInt(IO.readln("Geef een getal in: "));
}//einde geefGetal

