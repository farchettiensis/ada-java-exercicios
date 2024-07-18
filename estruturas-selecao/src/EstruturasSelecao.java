import java.util.Scanner;

public class EstruturasSelecao {
    public static void main(String[] args) {
        // dada a nota informada por um alino, exiba se ele está aprovado (média >=7), em prova final (entre 6 e 6.9) ou reprovado (média abaixo de 6)
        Scanner scanner = new Scanner(System.in);
        double media;

        System.out.println("Digite a média do aluno: ");
        media = scanner.nextDouble();

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 6 && media <= 6.9) {
            System.out.println("Aluno em prova final!");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }
}
