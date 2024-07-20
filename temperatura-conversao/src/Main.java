import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a unidade de temperatura atual (CELSIUS, FAHRENHEIT, KELVIN): ");
        UnidadeTemperatura unidadeAtual = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());

        System.out.println("Digite a unidade de temperatura desejada (CELSIUS, FAHRENHEIT, KELVIN): ");
        UnidadeTemperatura unidadeDesejada = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());

        System.out.println("Digite a temperatura atual: ");
        double temperaturaAtual = scanner.nextDouble();

        double temperaturaConvertida = converterTemperatura(temperaturaAtual, unidadeAtual, unidadeDesejada);

        System.out.printf("A temperatura convertida é: %.2f %s%n", temperaturaConvertida, unidadeDesejada);
        scanner.close();
    }

    public static double converterTemperatura(double temperatura, UnidadeTemperatura unidadeAtual, UnidadeTemperatura unidadeDesejada) {
        if (unidadeAtual == unidadeDesejada) {
            return temperatura;
        }

        double temperaturaEmCelsius = switch (unidadeAtual) {
            case CELSIUS -> temperatura;
            case FAHRENHEIT -> (temperatura - 32) * 5 / 9;
            case KELVIN -> temperatura - 273.15;
            default -> throw new IllegalArgumentException("Unidade de temperatura atual desconhecida: " + unidadeAtual);
        };


        return switch (unidadeDesejada) {
            case CELSIUS -> temperaturaEmCelsius;
            case FAHRENHEIT -> (temperaturaEmCelsius * 9 / 5) + 32;
            case KELVIN -> temperaturaEmCelsius + 273.15;
            default ->
                    throw new IllegalArgumentException("Unidade de temperatura desejada desconhecida: " + unidadeDesejada);
        };
    }
}

enum UnidadeTemperatura {
    CELSIUS,
    FAHRENHEIT,
    KELVIN
}
