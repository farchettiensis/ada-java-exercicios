public class InversaoArray {
    public static void main(String[] args) {
        /*
        Escreva um programa que inverta a ordem dos elementos em um array de caracteres.
        Escreva uma função que recebe um array e retorna um novo array de igual tamanho, mas na ordem inversa.
        Exemplo:
        Entrada: ['a', 'b', 'c', 'd', 'e'];
        Saída: ['e', 'd', 'c', 'b', 'a'];
        */
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] invertedArray = invertArray(array);

        printArrays(array, invertedArray);
    }

    public static char[] invertArray(char[] array) {
        char[] arrayInvertido = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }

    public static void printArrays(char[] array, char[] invertedArray) {
        System.out.println("Array original:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.printf("%n");

        System.out.println("\nArray invertido:");
        for (char c : invertedArray) {
            System.out.print(c + " ");
        }
    }

}
