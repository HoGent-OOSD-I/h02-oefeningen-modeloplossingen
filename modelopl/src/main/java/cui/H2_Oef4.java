package cui;

public class H2_Oef4
{
	public static void main(String[] args)
    {
		new H2_Oef4().zoekDeFouten();
	}

	private void zoekDeFouten()
    {
		int age = 22;

		if (age >= 65) {
			System.out.println("Age greater than or equal to 65");
		} else
			System.out.println("Age is less than 65 ");

	}
}
