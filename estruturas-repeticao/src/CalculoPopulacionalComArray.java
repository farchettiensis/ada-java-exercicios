import java.util.Scanner;

public class CalculoPopulacionalComArray {
    public static void main(String[] args) {
        /*
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
        int contaSalarioBaixo = 0;
        int tamanhoPopulacao;
        double maiorSalario = 0;
        double somaSalarios = 0;
        double mediaSalario;
        double mediaFilhos;
        double percentualSalarioBaixo = 0;

        System.out.println("Digite o tamanho da população: ");
        tamanhoPopulacao = scanner.nextInt();

        double[] salarios = new double[tamanhoPopulacao];
        int[] filhos = new int[tamanhoPopulacao];

        for (int i = 0; i < tamanhoPopulacao; i++) {
            System.out.println("Digite o salário do habitante " + (i + 1) + " (negativo para sair): ");
            double salario = scanner.nextDouble();
            if (salario < 0) {
                break;
            }

            System.out.println("Digite o número de filhos do habitante " + (i + 1) + ": ");
            int numFilhos = scanner.nextInt();

            salarios[i] = salario;
            filhos[i] = numFilhos;
        }

        for (int i = 0; i < tamanhoPopulacao; i++) {
            if (salarios[i] > 0) {
                somaSalarios += salarios[i];
                contador++;
            }
        }
        mediaSalario = somaSalarios / contador;

        int somaFilhos = 0;
        for (int i = 0; i < tamanhoPopulacao; i++) {
            somaFilhos += filhos[i];
        }
        mediaFilhos = (double) somaFilhos / contador;

        for (int i = 0; i < tamanhoPopulacao; i++) {
            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }
        }

        for (int i = 0; i < tamanhoPopulacao; i++) {
            if (salarios[i] < 150 && salarios[i] > 0) {
                contaSalarioBaixo++;
            }
        }
        percentualSalarioBaixo = (double) contaSalarioBaixo / contador * 100;

        System.out.println("Média de salário da população: R$ " + mediaSalario);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário dos habitantes: R$ " + maiorSalario);
        System.out.println("Percentual de pessoas com salário menor que R$ 150,00: " + percentualSalarioBaixo + "%");

        scanner.close();
    }
}
