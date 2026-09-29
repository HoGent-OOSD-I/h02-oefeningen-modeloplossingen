void main() {
int getal, aantalPriem = 0;
	boolean priem = true;

	getal = geefPositiefGetal();
	
	while (getal != 0)
	{
		if (getal == 1)
			priem = false;
		else
		{
			priem = !isDeelbaar(getal);
		}
			
		IO.print(String.format("%d is %s priemgetal!%n", getal, priem? "EEN" : "GEEN"));
		if (priem) 
			 aantalPriem++;
		
		getal = geefPositiefGetal();
	}
	IO.print(String.format("Het aantal priemgetallen is %d%n", aantalPriem));
}

boolean isDeelbaar(int getal) {
	for (int mogelijkeDeler = 2; mogelijkeDeler <= Math.sqrt(getal); mogelijkeDeler++) {
		if (getal % mogelijkeDeler == 0) {
			return true;
		}
	}
	return false;
}

int geefPositiefGetal()
{
	int getal;
	do
	{
		getal = Integer.parseInt(IO.readln("Geef een pos geheel getal (0 om te stoppen): "));
	}
	while (getal < 0);
	   //!(getal >= 0)
	return getal;
}//einde geefPos...

