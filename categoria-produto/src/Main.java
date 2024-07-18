import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Crie um enum chamado CategoriaProduto representando
        categorias de produtos (ELETRONICO, VESTUARIO, ALIMENTO).
        Utilize um Scanner para obter a categoria do usuário e imprima uma mensagem correspondente.
         */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite o número da categoria do produto (1 para ELETRONICO, 2 para VESTUARIO, 3 para ALIMENTO), ou -1 para sair:");
                int input = scanner.nextInt();

                if (input == -1) {
                    break;
                }

                CategoriaProduto categoria = CategoriaProduto.converteCodigo(input);

                switch (categoria) {
                    case ELETRONICO:
                        System.out.println("Você escolheu a categoria Eletrônico.");
                        break;
                    case VESTUARIO:
                        System.out.println("Você escolheu a categoria Vestuário.");
                        break;
                    case ALIMENTO:
                        System.out.println("Você escolheu a categoria Alimento.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Categoria inválida! Escolha entre 1 (ELETRONICO), 2 (VESTUARIO), ou 3 (ALIMENTO).");
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
