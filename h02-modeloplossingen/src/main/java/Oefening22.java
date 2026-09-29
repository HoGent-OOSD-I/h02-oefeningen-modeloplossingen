void main() {
    //afstand inlezen, tabel met afstand, snelheid en tijd weergeven
      int afstand, uur, minuut;
      
      afstand = leesAfstand();
      
      for (int snelheid=40; snelheid<=140; snelheid +=10)
      {
          uur = afstand / snelheid;                  //gehele deling
          minuut = afstand % snelheid * 60 / snelheid ; //omgerekend naar 60 minuten in 1 uur
          IO.print(String.format("%3d km%10d km/u%8d u %02d min%n",
                afstand, snelheid, uur, minuut));
      }
}//einde main

int leesAfstand() {
    int afstand;
    do
      {
          afstand = Integer.parseInt(IO.readln("Geef een afstand in kilometer (strikt positief geheel getal): "));
      }
      while (afstand <= 0);
         //!(afstand > 0)
    return afstand;
}//einde leesAfstand
