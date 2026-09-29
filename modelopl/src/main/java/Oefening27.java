void main() {

	int getal, aantal = 0;

	getal = geefGetal();

	while (getal != 1) {
		if (getal % 2 == 0) {
			getal /= 2;
			//aantal++;
		}
		else {
			//getal = (getal * 3) + 1;
			getal *= 3;
			getal++;
			//aantal++;
		}
		aantal++;
	}
	IO.print(String.format("Het getal wijzigt %d %s%n",
			aantal, aantal == 1 ? "keer" : "keren"));
}//einde main

int geefGetal() {
	int getal;
	do {
		getal = Integer.parseInt(IO.readln("Geef een strikt positief geheel getal in: "));
	} while (getal <= 0);
	return getal;
}//einde geefGetal
