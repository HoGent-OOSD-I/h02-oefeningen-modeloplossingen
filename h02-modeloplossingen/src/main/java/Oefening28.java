void main() {

	int aantal1 = 0, aantal2 = 0, aantal3 = 0, aantal4 = 0;
	int getal;
	for (int aantal = 1;aantal <= 15;aantal++)
	{
		getal = geefAntwoord(aantal);
		switch (getal)
		{
		case 1 -> aantal1++;
		case 2 -> aantal2++;
		case 3 -> aantal3++;
		case 4 -> aantal4++;
		}
	}
	IO.print(String.format("Aantal 1 = %d%nAantal 2 = %d%nAantal 3 = %d%nAantal 4 = %d%n",
			aantal1, aantal2, aantal3,aantal4));
}//einde main

int geefAntwoord(int aantal)
{
	int antwoord;
	boolean ongeldig;
	do
	{
		antwoord = Integer.parseInt(IO.readln(String.format("Geef antwoord %d in (1, 2, 3 of 4): ", aantal)));
		ongeldig = antwoord < 1 || antwoord > 4;
		if (ongeldig)
			IO.println("Foutieve waarde! Probeer opnieuw!");
	}while(ongeldig);
	   //!(antwoord >=1 && antwoord <= 4)
	return antwoord;
}//einde geefAntwoord

