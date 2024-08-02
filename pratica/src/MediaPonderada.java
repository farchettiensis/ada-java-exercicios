import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[3];
		// double notas = {8.0, 1.0, 7.8};
		double[] pesos = new double[3];
		// double pesos = {2.5, 4.0, 3.5};

		for (int contador = 0; contador < notas.length; contador++) {
			System.out.println("Digite uma nota:");
			double nota = Double.parseDouble(scanner.nextLine());

			if (nota <= 0) {
				throw new ArithmeticException("Erro: o valor deve ser positivo e acima de zero.");
			}

			notas[contador] = nota;

			System.out.println("Digite um peso:");
			double peso = Double.parseDouble(scanner.nextLine());

			pesos[contador] = peso;
		}

		double media = calcularMediaPonderada(notas, pesos);

		System.out.printf("Média ponderada: %.2f%n", media);
	}

	public static double calcularMediaPonderada(double[] notas, double[] pesos) {
		double somaNotasPesadas = Double.MIN_VALUE;
		double somaPesos = Double.MIN_VALUE;
		for (int contador = 0; contador < notas.length; contador++) {
			somaNotasPesadas += notas[contador] * pesos[contador];
			somaPesos += pesos[contador];
		}

		return somaNotasPesadas / somaPesos;
	}
}