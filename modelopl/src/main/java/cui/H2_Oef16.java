package cui;

public class H2_Oef16
{
    public static void main (String[] args)
    {
    	new H2_Oef16().printPatronen();
    }
    
    private void printPatronen()
    {
    	/* patroon A
    	*: rij 1-> 1 ster
    	**
    	***
    	...rij i -> i sterren
    	*********
    	**********: rij 10 -> 10 sterren
    	*/
        for (int rij=1;rij<=10;rij++)
        {
            for (int ster=1;ster<=rij;ster++)
                System.out.print("*");
            
            System.out.println();
        }
        System.out.println();
        
        /* patroon B
        rij 1: 0 spaties, 10 sterren
        rij 2: 1 spatie, 9 sterren
        rij 3: 2 spaties, 8 sterren

        rij i: aantal spaties + aantal sterren = 10

        rij 10: 9 spaties, 1 ster
        */
        for (int rij=1;rij<=10;rij++)
        {
            //spaties:0->9
            for (int spatie=1;spatie<=rij-1;spatie++)
                System.out.print(" ");
            
            //sterren:10->1
            for (int ster=10;ster>=rij;ster--)
                System.out.print("*");
            
            System.out.println();
        }
        
        /* patroon C
        10 sterren
        9 sterren
        ...
        1 ster
        */
        for (int rij=1;rij<=10;rij++)
        {
            for (int ster=10;ster>=rij;ster--)
                System.out.print("*");
            System.out.println();
        }
        
        // patroon D
        for (int rij = 1; rij <= 10; rij++)
        {
            //spaties tekenen
            for (int spatie = (10 - rij); spatie > 0; spatie--)
                System.out.print(" ");

            //sterren tekenen
            for (int ster = 1; ster <= rij; ster++)
                System.out.print("*");
            
            //nieuwe regel
            System.out.println();
        }
    }
}
