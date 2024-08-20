import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] contatos = new String[2][3];
        int contadorDeContatos = 0;

        while (true) {
            System.out.println("Nome:");
            String nomeContato = scanner.nextLine();

            System.out.println("Telefone:");
            String telefoneContato = scanner.nextLine();
            ;

            System.out.println("Email:");
            String emailContato = scanner.nextLine();

            contatos[contadorDeContatos] = new String[]{nomeContato, telefoneContato, emailContato};
//            contatos[contadorDeContatos][0] = nomeContato;
//            contatos[contadorDeContatos][1] = emailContato;
//            contatos[contadorDeContatos][2] = telefoneContato;

            contadorDeContatos++;

            if (contadorDeContatos >= contatos.length) {
                System.out.println("Agenda lotada.");
                break;
            }
        }

        for (int i = 0; i < contatos.length; i++) {
            System.out.printf("id: %s, nome: %s, telefone: %s, email: %s%n", i, contatos[i][0],
                    contatos[i][1], contatos[i][2]);
        }

//        for (int i = 0; i < contatos.length; i++) {
//            for (int j = 0; j < contatos[i].length; j++) {
//                System.out.println(contatos[i][j]);
//            }
//        }

        int proxPosicaoVazia = -1;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                proxPosicaoVazia = i;
                break;
            }
        }
    }
}
