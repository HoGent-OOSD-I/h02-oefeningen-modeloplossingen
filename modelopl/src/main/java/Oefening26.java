void main() {
    int getal, deler;
    int teller = 1, aantal = 0;
    
    deler = geefDeler();
    
    getal = geefGetal(teller);
    
    while (getal != -1) 
    {          
        if (getal % deler == 0) 
          aantal++;
        
        getal = geefGetal(++teller);
    }
    
    IO.print(String.format("%nEr %s %d getal%s deelbaar door %d%n",
            aantal == 1? "is":"zijn",aantal, aantal == 1? "":"len",deler));
}

int geefDeler() {
    int deler;
    do
    {
        deler = Integer.parseInt(IO.readln("Geef een strikt positieve deler in: "));
    }
    while (deler <= 0);
          //!(deler > 0)
    return deler;
}//einde geefDeler

int geefGetal(int teller)
{
    int getal;
    do
    {
        getal = Integer.parseInt(IO.readln(String.format("Geef positief getal %d in (of stop met -1): ",
                teller)));
    }
    while (getal < -1);	
       //!(getal == -1 || getal >= 0   ==> getal >= -1)
    return getal;
}//einde geefGetal
