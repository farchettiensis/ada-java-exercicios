public class NumeroUnico {
    public static void main(String[] args) {
        int[] teste1 = {1, 2, 2, 5, 5, 5, 4, 4, 10, 10};
        System.out.println(numeroUnico(teste1));
    }

    public static int numeroUnico(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int contador = 0;

            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) contador++;
            }

            if (contador == 1) return input[i];
        }

        return -1;
    }
}
