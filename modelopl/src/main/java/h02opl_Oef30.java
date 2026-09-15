void main() {
	int getal, vorig, aantalKleiner = 0;
	
	getal = geefGetal();
	vorig = getal;
	while (getal != -2000)
	{
		if (vorig > getal)
			aantalKleiner++;

		vorig = getal;
		getal = geefGetal();
	}
	IO.print(String.format("Het aantal getallen dat direct gevolgd wordt door een kleiner getal is %d%n", aantalKleiner));
}

int geefGetal()
{
	return Integer.parseInt(IO.readln("Geef een geheel getal (-2000 om te stoppen): "));
}//einde geefGetal
