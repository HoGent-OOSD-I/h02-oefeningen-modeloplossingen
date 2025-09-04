package cui;

public class H2_Oef1
{
    public static void main(String[] args)
    {
        H2_Oef1 object = new H2_Oef1();
        object.werkMetIf();
    }// einde main

    private void werkMetIf()
    {
        // opgave1
        int x = 0;
        if (x >= 0)
            System.out.println("positief");
        else // x < 0
            System.out.println("negatief");

        // opgave2
        int temp = -12;
        if (temp <= 10) {
            System.out.println("koud");
        } else // temp > 10
        {
            if (temp < 20) {
                System.out.println("goed");
            } else // temp >=20
            {
                System.out.println("warm");
            }
        }

        // opgave3
        x = -3;
        if (x >= 0) {
            if (x % 2 == 0)
                System.out.println("positief en even");
            else
                System.out.println("positief en oneven");
        } else // x < 0
        {
            if (x % 2 == 0)
                System.out.println("negatief en even");
            else
                System.out.println("negatief en oneven");
        }

        //OF
        System.out.printf("%s en %s",
                x >= 0 ? "positief" : "negatief",
                x % 2 == 0 ? "even" : "oneven");

    }// einde werkMetIf

}
