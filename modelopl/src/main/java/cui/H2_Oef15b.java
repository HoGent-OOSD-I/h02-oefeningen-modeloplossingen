package cui;

public class H2_Oef15b
{
    public static void main(String[] args)
    {
    	new H2_Oef15b().printSterren();
    }
    	
    private void printSterren()
	{
    	for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                for (int k = 1; k <= 4; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
