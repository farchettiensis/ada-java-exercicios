import java.util.Scanner;

public class Teste {
    static String[][] contatos = new String[100][3];
    static int opcao, indice = 0;

    static public void iniciarSistema() {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println(
                        """
                                ##################
                                ##### AGENDA #####
                                ##################
                                """);

                System.out.println("\n>>>> Menu Contato Ex<<<<");
                System.out.println("1 - Adicionar Contato");
                System.out.println("2 - Detalhar Contato");
                System.out.println("3 - Editar Contato");
                System.out.println("4 - Remover Contatos");
                System.out.println("5 - Listar Contatos");
                System.out.println("6 - Sair\n");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        indice--;
                        break;
                    case 5:
                        System.out.println("5");
                        break;
                    case 6:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente!");
                        break;
                }

            } while (opcao != 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
