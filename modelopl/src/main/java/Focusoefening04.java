void main()
{
        int i, k;
        // invoer van een waarde voor i
        i = Integer.parseInt(IO.readln("Geef een geheel getal: "));

        // mbv een switch-expressie
        k = switch (i) {
            case 1 -> 3;
            case 2 -> 6;
            case 3, 4 -> 10;
            default -> 20;
        }; // ; is noodzakelijk!!

        IO.print(String.format("De waarde van k: %d%n", k));

        int x, y = 0;
        // invoer van een waarde voor x
        x = Integer.parseInt(IO.readln("Geef een geheel getal: "));


    // mbv een switch-statement
        switch (x) {
            case 100, 150, 170, 199 -> y = y + 1;
        }
        ;
        /*  NIET (want geen default-label; noodzakelijk bij een switch-expressie!)
        y = switch(x)
                {
                    case 100, 150, 170, 199 -> y + 1;
                };
         */

        IO.print(String.format("De waarde van y: %d%n", y));

}//einde main
