package cui;
 
public class H2_Oef9c 
{
    public static void main(String[] args)
    {
    	new H2_Oef9c().maakTabel();
	}
	
	private void maakTabel()
	{	
        System.out.printf("%-8S%-8S%-8S%-8S%n", "n", "10*n", "100*n", "1000*n");

        for(int n=1;n <= 5;n++)
        {
            System.out.printf("%-8d%-8d%-8d%-8d%n", n, n * 10, n * 100, n * 1000);
        }
    }
}
