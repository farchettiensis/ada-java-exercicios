import java.util.Scanner;

public class ExcecaoAritmetica {
    public static void main(String[] args) {
        /*
        Exercício 2: Crie um programa que use a exceção Arithmetic Exception
        para validar se um número pode ser dividido por outro (lembrando que um número não pode ser dividido por zero)
        */
        double num1;
        double num2;
        double result;
        boolean isDivisible = false;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite outro número: ");
            num2 = Double.parseDouble(scanner.nextLine());

            isDivisible = testDivisibility(num1, num2);

            if (isDivisible) {
                result = num1 / num2;
                System.out.printf("Os números são divisíveis. O resultado é: %.0f.%n", result);
            } else {
                System.out.println("Os números não são divisíveis.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static boolean testDivisibility(double num1, double num2) {
        boolean isDivisible = false;

        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        } else {
            isDivisible = num1 % num2 == 0 ? true : false;
        }

        return isDivisible;
    }
}
