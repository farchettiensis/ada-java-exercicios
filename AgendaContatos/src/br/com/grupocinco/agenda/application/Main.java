package br.com.grupocinco.agenda.application;

import java.util.Scanner;

public class Main {
    static String[][] contatos = new String[100][3];
    static int indiceAgenda = 0;

    static void adicionar(String nome, String telefone, String email) {
        contatos[indiceAgenda][0] = nome;
        contatos[indiceAgenda][1] = telefone;
        contatos[indiceAgenda][2] = email;
        indiceAgenda++;
    }

    // Permitir editar telefone?
    static void editar(String telefone, String novoNome, String novoEmail) {
        for (int i = 0; i < indiceAgenda; i++) {
            if (contatos[i][1].equals(telefone)) {
                contatos[i][0] = novoNome;
                contatos[i][2] = novoEmail;
                System.out.println("Contato atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    static void remover(String telefone) {
        for (int i = 0; i < indiceAgenda; i++) {
            if (contatos[i][1].equals(telefone)) {
                for (int j = i; j < indiceAgenda - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                contatos[indiceAgenda - 1] = new String[3];
                indiceAgenda--;
                System.out.println("Contato removido com sucesso.");
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    static void detalhar(String telefone) {
        for (int i = 0; i < indiceAgenda; i++) {
            if (contatos[i][2].equals(telefone)) {
                System.out.printf("Nome: %s, Telefone: %s, E-mail: %s%n", contatos[i][0], contatos[i][1], contatos[i][2]);
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("" +
                    "##################\n" +
                    "##### AGENDA #####\n" +
                    "##################");
            System.out.println();
            System.out.println(">>>> Contatos <<<<");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Detalhar Contato");
            System.out.println("3 - Editar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");

            System.out.println("Selecione uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

        }
    }
}
