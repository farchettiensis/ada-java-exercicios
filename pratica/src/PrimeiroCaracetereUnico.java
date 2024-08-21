public class PrimeiroCaracetereUnico {
    public static void main(String[] args) {
        String teste1 = "amor";
        System.out.println(primeiroCaractereUnico(teste1));

        String teste2 = "cocada";
        System.out.println(primeiroCaractereUnico(teste2));

        String teste3 = "aaa";
        System.out.println(primeiroCaractereUnico(teste3));
    }

    public static int primeiroCaractereUnico(String input) {
        for (int i = 0; i < input.length(); i++) {
            int contador = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) contador++;
            }

            if (contador == 1) return i;
        }
        return -1;
    }
}
