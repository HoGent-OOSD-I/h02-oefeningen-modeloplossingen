void main() {
    int getal, som = 0;

    for (int aantal=1;aantal <= 5;aantal++)
    {
        getal = Integer.parseInt(IO.readln(String.format("Geef getal %d: ", aantal)));
        som += getal;
    }
    IO.print(String.format("De som van de getallen = %d%n", som));
}//einde main
