public class ValoresDecimais {
    public static void main(String[] args) {
        double[] teste1 = {2.5, 3.2, 4.5, 5, 6};
        System.out.println(elementosRepetidos(teste1));

        double[] teste2 = {2, 2, 3.1, 4, 4.1, 4.1};
        System.out.println(elementosRepetidos((teste2)));

        double[] teste3 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(elementosRepetidos(teste3));

        double[] teste4 = {1.0, 2.0, 2.0, 3.0, 4.0};
        System.out.println(elementosRepetidos(teste4));

        double[] teste5 = {5.5, 6.6, 7.7, 8.8, 5.5};
        System.out.println(elementosRepetidos(teste5));

        double[] teste6 = {9.9, 9.9, 9.9, 9.9, 9.9};
        System.out.println(elementosRepetidos(teste6));

        double[] teste7 = {10.0};
        System.out.println(elementosRepetidos(teste7));

        double[] teste9 = {};
        System.out.println(elementosRepetidos(teste9));
    }

    public static boolean elementosRepetidos(double[] input) {
        for (int i = 0; i < input.length; i++) {
            int contador = 0;

            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) contador++;
            }

            if (contador > 1) return true;
        }
        return false;
    }
}
