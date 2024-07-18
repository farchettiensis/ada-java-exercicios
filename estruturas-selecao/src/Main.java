import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result;

        System.out.println("Digite um número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        num2 = scanner.nextDouble();

        result = num1 + num2;
        System.out.println("O resultado da soma é: " + result);

        result = num1 - num2;
        System.out.println("O resultado da subtração é: " + result);

        result = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + result);

        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("O resultado da divisão é: " + result);
        } else {
            System.out.println("Não é possível dividir por zero!");
        }

        scanner.close();
    }
}
