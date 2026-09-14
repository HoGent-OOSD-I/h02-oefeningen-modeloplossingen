void main() {
    int teller, noemer, deling, rest;
        
    teller = geefTeller();
    noemer = geefNoemer();
    
    deling = teller/noemer;
    rest = teller % noemer;
    
    IO.print(String.format("%d/%d = %d%nrest =  %d%n%n",
                             teller,noemer, deling, rest));
   
    if (rest == 0) 
        IO.print(String.format("vereenvoudigde breuk = %d / 1%n", deling));
}

int geefNoemer() {
    int noemer;
    do {
        noemer = Integer.parseInt(IO.readln("Geef de noemer in van de breuk: "));
    } while (noemer == 0);
    return noemer;
}//einde geefNoemer

int geefTeller() {
    return Integer.parseInt(IO.readln("Geef de teller in van de breuk: "));
} //einde geefTeller

