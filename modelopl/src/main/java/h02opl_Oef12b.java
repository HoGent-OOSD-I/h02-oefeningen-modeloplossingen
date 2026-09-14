void main() {
    int getal, aantalEven = 0, aantalDeelbaarDoor3 = 0;
    
    for (int teller = 1;teller <= 5;teller++)
    {
        getal = Integer.parseInt(IO.readln(String.format("Geef getal %d in: ", teller)));

        if (getal%2 == 0)
            aantalEven ++;
        if (getal%3 == 0)
            aantalDeelbaarDoor3 ++;
    }
    IO.print(String.format("Je gaf %d even getal%s en %d getal%s deelbaar door 3 in.%n",
            aantalEven,
            aantalEven==1?"":"len",
            aantalDeelbaarDoor3,
            aantalDeelbaarDoor3==1?"":"len"));
}//einde main
