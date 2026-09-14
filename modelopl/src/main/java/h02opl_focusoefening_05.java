void main() {

        int i = 1, j = 2, k = 3, m = 2;

        System.out.println(i == 1); // true
        System.out.println(j == 3); // false
        System.out.println(i >= 1 && j < 4); // true && true --> true
        System.out.println(m <= 99 && k < m); // true & false --> false
        System.out.println(j >= i || k == m); // true || ... (false, maar niet belangrijk) --> true
        System.out.println(k + m < j || 3 - j >= k); // false || false --> false
        System.out.println(!(k > m)); // !true --> false

}//einde main
