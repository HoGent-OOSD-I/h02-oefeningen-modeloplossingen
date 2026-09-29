void main()
{
    // opgave1
    int x = 0;
    if (x >= 0)
        IO.println("positief");
    else // x < 0
        IO.println("negatief");

    // opgave2
    int temp = -12;
    if (temp <= 10) {
        IO.println("koud");
    } else // temp > 10
    {
        if (temp < 20) {
            IO.println("goed");
        } else // temp >=20
        {
            IO.println("warm");
        }
    }

    // opgave3
    x = -3;
    if (x >= 0) {
        if (x % 2 == 0) // even
            IO.println("positief en even");
        else // oneven
            IO.println("positief en oneven");
    } else // x < 0
    {
        if (x % 2 == 0) // even
            IO.println("negatief en even");
        else // oneven
            IO.println("negatief en oneven");
    }

    // OF (voor wie de conditionele operator al kent)
    IO.print(String.format("%s en %s",
            x >= 0 ? "positief" : "negatief",
            x % 2 == 0 ? "even" : "oneven"));

} // einde main

