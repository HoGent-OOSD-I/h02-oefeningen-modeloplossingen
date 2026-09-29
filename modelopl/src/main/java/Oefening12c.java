void main() {
    IO.print(String.format("%-8S%-8S%-8S%-8S%n", "n", "10*n", "100*n", "1000*n"));

    for(int n=1;n <= 5;n++)
    {
        IO.print(String.format("%-8d%-8d%-8d%-8d%n", n, n * 10, n * 100, n * 1000));
    }
}//einde main
