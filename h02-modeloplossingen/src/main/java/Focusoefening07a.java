void main() {

		int y, x = 1, total = 0;

		for ( ; x <= 10 ; x = x+1)
		{
			y = x * x;
			IO.println(String.format("%d", y));
			total = total + y;
		}

	IO.println(String.format("Total is %d", total));

}//einde main
