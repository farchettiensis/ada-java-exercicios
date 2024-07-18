import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;

public class CalculoPopulacional {
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
        Obs.: O final da leituras dos dados se dará com a entrada de
        um “salário negativo”.
        */
        ArrayList<Double> salarios = new ArrayList<>();
        ArrayList<Integer> filhos = new ArrayList<>();
        double somaSalarios = 0;
        double mediaSalarial;
        double maiorSalario = 0;
        int totalFilhos = 0;
        double mediaFilhos;
        int contador = 0;
        double percentual;

        try {
            Path path = Paths.get("dados.txt");
            Scanner scanner = new Scanner(path);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split(",");

                double salario = Double.parseDouble(dados[0].trim());
                int numFilhos = Integer.parseInt(dados[1].trim());

                salarios.add(salario);
                filhos.add(numFilhos);

                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }

                if (salario < 150) {
                    contador++;
                }

//                somaSalarios += salario;
//                totalFilhos += numFilhos;
            }

            for (Double salario : salarios) {
                somaSalarios += salario;
            }
            mediaSalarial = somaSalarios / salarios.size();

            for (Integer filho : filhos) {
                totalFilhos += filho;
            }
            mediaFilhos = (double) totalFilhos / filhos.size();

            percentual = (1.0 * contador) / salarios.size() * 100;

            System.out.printf("Média salarial: %.2f %n", mediaSalarial);
            System.out.printf("Média de filhos por habitante: %.2f %n", mediaFilhos);
            System.out.printf("Maior salário: %.2f %n", maiorSalario);
            System.out.printf("Percentual de pessoas com salário menor que R$ 150,00: %.2f%% %n", percentual);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
