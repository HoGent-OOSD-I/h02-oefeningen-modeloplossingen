void main() {

        int i = 1, j = 2, k = 3, m = 2;

        IO.println(i == 1); // true
        IO.println(j == 3); // false
        IO.println(i >= 1 && j < 4); // true && true --> true
        IO.println(m <= 99 && k < m); // true & false --> false
        IO.println(j >= i || k == m); // true || ... (false, maar niet belangrijk) --> true
        IO.println(k + m < j || 3 - j >= k); // false || false --> false
        IO.println(!(k > m)); // !true --> false

}//einde main
