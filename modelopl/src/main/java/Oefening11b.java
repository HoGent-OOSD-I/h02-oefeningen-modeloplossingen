void main() {
    int teller = 0;

    for (int onevenGetal = 51; onevenGetal >=1 ; onevenGetal -=2)
    {
        IO.print(String.format("%2d  ", onevenGetal));
        teller++;
        if (teller % 5 == 0)
            IO.println();
    }
    IO.println();
}

