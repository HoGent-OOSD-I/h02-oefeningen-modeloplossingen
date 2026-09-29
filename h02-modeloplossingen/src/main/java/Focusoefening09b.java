void main() {
    int z = 10, totaal = 0; // declaratie én initialisatie van totaal
    while ( z <= 100 ) // GEEN puntkomma
    { // accolades VEREIST want statement is samengesteld
        totaal = totaal + z;
        z = z + 1;
    }
}