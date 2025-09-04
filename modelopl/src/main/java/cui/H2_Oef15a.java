package cui;

public class H2_Oef15a
{
   public static void main( String[] args )
   {
	   new H2_Oef15a().printApestaartjes();
   }
   
   private void printApestaartjes()
   {
	   for (int i = 1; i <= 10; i++ ) 
       {
		   for ( int j = 1; j <= 5; j++ )
			   System.out.print( '@' );
		   System.out.println();
      } 
   } 
} 