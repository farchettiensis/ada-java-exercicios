import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        // Exercício 6: Verificar o Maior de Três Números
        // Escreva um programa que aceite três números inteiros e determine o maior entre eles.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Digite o terceiro número: ");
            int num3 = scanner.nextInt();

            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            } else if (num3 > maior) {
                maior = num3;
            }

//            Usando ternário:
//            maior =
//                    (num2 > maior)
//                            ? num2
//                            : ((num3 > maior)
//                            ? num3
//                            : maior);


//            Outra alternativa:
//            int maior;
//            if (num1 > num2 && num1 > num3) {
//                maior = num1;
//            } else if (num2 > num1 && num2 > num3) {
//                maior = num2;
//            } else {
//                maior = num3;
//            }

            System.out.println("O maior número é " + maior + ".");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
