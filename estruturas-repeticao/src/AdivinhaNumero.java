import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {
    public static void main(String[] args) {
        /*
        Escreva um programa que gera aleatoriamente um número entre 1 e
        10. O usuário deve adivinhar o número. O programa deve informar
        se o número inserido é muito alto, muito baixo ou correto. O
        jogo continua até que o usuário adivinhe corretamente.

        Utilize a biblioteca do java Random.
        */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        int numeroUsuario;

//        while (true) {
//            System.out.print("Digite um número entre 1 e 10: ");
//            numeroUsuario = Integer.parseInt(scanner.nextLine());
//
//            if (numeroUsuario == numeroAleatorio) {
//                System.out.println("Correto!");
//                break;
//            } else if (numeroUsuario < numeroAleatorio) {
//                System.out.println("Muito baixo!");
//            } else {
//                System.out.println("Muito alto!");
//            }
//        }

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            numeroUsuario = Integer.parseInt(scanner.nextLine());

            System.out.println(numeroUsuario == numeroAleatorio ? "Correto!" :
                    (numeroUsuario < numeroAleatorio ? "Muito baixo!" : "Muito alto!"));

        } while (numeroUsuario != numeroAleatorio);

        scanner.close();
    }
}
