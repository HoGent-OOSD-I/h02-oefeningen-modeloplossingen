void main() {
    //lees postnr in, "zoek op in tabel", druk stad of foutboodschap
    int postcode;
    String stad;

    postcode = leesPostcode();

    stad = switch(postcode)
    {
        case 9300 -> "Aalst";
        case 2000 -> "Antwerpen" ;
        case 1000 -> "Brussel";
        case 9200 -> "Dendermonde";
        case 9000 -> "Gent";
        case 8500 -> "Kortrijk" ;
        case 9700 -> "Oudenaarde";
        case 2300 -> "Turnhout";
        default -> "";
    };

    if (!stad.isEmpty())
        IO.print(String.format("Postnummer %d komt overeen met de stad %s%n", postcode, stad));
    else
        IO.print(String.format("Postnummer %d bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen%n", postcode));
}//einde main

int leesPostcode() {
    int postcode;
    do
    {
        postcode = Integer.parseInt(IO.readln("Geef een postcode (4 cijfers): "));
    } 
    while (postcode < 1000 || postcode > 9999);
       //!(postcode >= 1000 && postcode <= 9999)
    return postcode;
}//einde leesPostcode
