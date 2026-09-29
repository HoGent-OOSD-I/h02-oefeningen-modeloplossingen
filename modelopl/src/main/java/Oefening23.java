void main() {
	int getal, grootste = Integer.MIN_VALUE,
			opEenNa = Integer.MIN_VALUE;
	        	        
	for (int teller = 1;teller <= 10;teller++)
	{
		getal = geefGetal(teller);
		if (getal > grootste)
		{
			opEenNa = grootste;
			grootste = getal;
		}
		else
			if (getal>opEenNa && getal<grootste)
				opEenNa = getal;
		
	}
	if (opEenNa != Integer.MIN_VALUE) 
		IO.print(String.format("%nHet op één na grootste getal is %d%n", opEenNa));
}

int geefGetal(int teller)
{
	return Integer.parseInt(IO.readln(String.format("Geef getal %d in: ",teller)));
}//einde geefGetal
