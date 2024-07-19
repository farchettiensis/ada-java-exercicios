public class MaiorElemento {
    public static void main(String[] args) {
        /*
        Implemente uma função que encontre e retorne o maior
        elemento em um array de doubles.
        */
        double[] doubleArray = {2.5, 1.8, 4.3, 3.1, 5.7};
        double largestDouble = 0;

        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > largestDouble) {
                largestDouble = doubleArray[i];
            }
        }
        System.out.printf("Maior double: %.1f.", largestDouble);
    }
}
