import java.util.Scanner;

public class CalculoPopulacao {
    public static void main(String[] args) {
        // Solução simplificada
        /*
        while – Calculo Populacional
        A prefeitura de uma cidade deseja fazer uma pesquisa entre
        seus habitantes. Faça um programa para coletar dados sobre o
        salário e número de filhos de cada habitante e após as
        leituras, escrever:
        a) Média de salário da população
        b) Média do número de filhos
        c) Maior salário dos habitantes
        d) Percentual de pessoas com salário menor que R$ 150,00
        Obs.: O final da leitura dos dados se dará com a entrada de
        um “salário negativo”.
        */
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int contadorSalarioMenor150 = 0;
        double salarioSoma = 0;
        double salario;
        double mediaSalario;
        double maiorSalario = 0;
        int filhos;
        int totalFilhos = 0;
        double mediaFilhos;
        double percentual;

        while (true) {
            System.out.println("Digite o salário: ");
            salario = Double.parseDouble(scanner.nextLine());
            if (salario < 0) {
                break;
            } else {
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }
                if (salario < 150) {
                    contadorSalarioMenor150++;
                }
                salarioSoma += salario;
                contador++;
            }

            System.out.println("Digite o número de filhos: ");
            filhos = Integer.parseInt(scanner.nextLine());
            totalFilhos += filhos;
        }

        mediaSalario = salarioSoma / contador;
        mediaFilhos = (1.0 * totalFilhos) / contador;
        percentual = (double) contadorSalarioMenor150 / contador * 100;

        System.out.printf("Média salarial: %.2f.%n", mediaSalario);
        System.out.printf("Média de filhos: %.2f.%n", mediaFilhos);
        System.out.printf("Maior salário: %.2f.%n", maiorSalario);
        System.out.printf("Percentual de pessoas com salário menor que R$ 150,00: %.2f%% %n", percentual);
    }
}
