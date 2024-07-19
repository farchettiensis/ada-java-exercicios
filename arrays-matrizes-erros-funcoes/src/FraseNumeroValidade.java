import java.util.Scanner;

public class FraseNumeroValidade {
    public static void main(String[] args) {
        /*
        Crie um programa que solicite ao usuário para digitar uma frase ou número,
        realize a leitura e utilize um bloco try-catch para verificar se a string representa um número inteiro válido.
        */
        Scanner scanner = new Scanner(System.in);
        String input;
        int number;

        System.out.println("Digite uma frase ou número: ");
        input = scanner.nextLine();

        validateString(input);
    }

    public static void validateString(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.printf("%s é um número inteiro válido.", input);
        } catch (Exception e) {
            System.out.printf("'%s' não é um número inteiro válido.", input);
        }
    }
}
