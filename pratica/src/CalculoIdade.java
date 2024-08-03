import java.util.Scanner;

public class CalculoIdade {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int anos;
        int dias;
        double meses;

        System.out.println("Digite a idade:");
        anos = Integer.parseInt(scanner.nextLine());

        dias = calculaDias(anos);
        meses = calculaMes(dias);

        System.out.printf("Anos: %d%nMeses: %.2f%nDias: %d", anos, meses, dias);
    }

    static int calculaDias(int anos) {
        return anos * 365;
    }

    static double calculaMes(int dias) {
        return (1.0 * dias) / 30;
    }
}
