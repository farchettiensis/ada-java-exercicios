import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /*
        Escreva um programa que solicita ao usuário para inserir um
        número e imprime a tabuada desse número de 1 a 10.
        */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int multiplicador;
        int resultado;

        System.out.println("Tabuada de qual número?");
        numero = Integer.parseInt(scanner.nextLine());

        for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
            resultado = numero * multiplicador;
            System.out.printf("%s X %s = %s %n", numero, multiplicador, resultado);
        }
    }
}
