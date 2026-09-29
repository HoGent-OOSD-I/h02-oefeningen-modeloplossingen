void main() {
    
    int aantalLeeuwen = 50;
    int groei = 15;
    int jaar = 0;

    do
    {
        aantalLeeuwen += aantalLeeuwen * groei / 100; 
        jaar++;
    } while (aantalLeeuwen<=1000);
    
    IO.print(String.format("1000 leeuwen na %d jaar%n", jaar));
    
}//einde main

