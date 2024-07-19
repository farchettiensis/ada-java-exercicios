public class MediaNumerosPares {
    public static void main(String[] args) {
        /*
        Desenvolva um programa que calcule e imprima a média
        dos números pares em um array de inteiros que vão de 1
        ao 10.
        Lembrando para utilizar contador e operador de
        atribuição.
        */
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int count = 0;
        double average;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            average = (1.0 * sum) / count;
            System.out.printf("A média dos números pares é %.2f", average);
        } else {
            System.out.println("Não há números pares no array.");
        }
    }
}
