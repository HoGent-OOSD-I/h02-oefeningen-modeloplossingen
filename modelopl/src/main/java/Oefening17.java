void main() {
	int getal = geefGetal();

	if (getal % 2 == 0)
		IO.print(String.format("Het ingevoerde getal %d is een even getal%n", getal));
	else
		IO.print(String.format("Het ingevoerde getal %d is een oneven getal%n", getal));
}//einde main

int geefGetal()
{
	return Integer.parseInt(IO.readln("Geef een geheel getal in: "));
}//einde geefGetal
