public class InversaoArray {
    public static void main(String[] args) {
        /*
        Exercício 3: Crie um programa que inverta um array de inteiros
        */
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }

        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.println(arrayInvertido[i]);
        }
    }
}
