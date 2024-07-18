import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        /*
        Escreva um programa que solicita ao usuário para inserir um
        número e verifica se esse número é primo ou não.
        */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int divisor;
        boolean primo = true;

        while (true) {
            System.out.println("Digite um número: (-1 para sair): ");
            numero = Integer.parseInt(scanner.nextLine());

            if (numero == -1) {
                break;
            }

            if (numero <= 1) {
                primo = false;
            } else {
                for (divisor = 2; divisor <= numero / 2; divisor++) {
                    if (numero % divisor == 0) {
                        primo = false;
                        break;
                    }
                }
                /* Alternativas
                for (divisor = 2; divisor * divisor <= numero; divisor++) {
                    if (numero % divisor == 0) {
                        primo = false;
                        break;
                    }
                }
                for (divisor = 2; divisor < numero; divisor++) {
                    if (numero % divisor == 0) {
                        primo = false;
                        break;
                    }
                }
                */
            }


            if (primo) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }

//            System.out.println("Continuar? s/n");
//            String continuar = scanner.nextLine().toLowerCase();
//
//            if (continuar.equals("n")) {
//                break;
//            }
        }
        scanner.close();
    }
}
