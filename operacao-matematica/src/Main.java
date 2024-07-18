import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite um número, ou 'sair' para sair: ");
                String input = scanner.next();
                if (input.equals("sair")) {
                    break;
                }
                double num1 = Double.parseDouble(input);

                System.out.print("Digite outro número: ");
                double num2 = scanner.nextDouble();

                System.out.print("Digite o símbolo da operação (+, -, *, /): ");
                String operacaoSimbolo = scanner.next();

                double result = realizaOperacao(num1, num2, operacaoSimbolo);
                System.out.println("O resultado da operação é: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Formato de número inválido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: Símbolo de operação inválido. Use +, -, *, /.");
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static double realizaOperacao(double num1, double num2, String operacaoSimbolo) {
        OperacaoMatematica operacaoMatematica = null;
        for (OperacaoMatematica operacao : OperacaoMatematica.values()) {
            if (operacao.getOperacao().equals(operacaoSimbolo)) {
                operacaoMatematica = operacao;
                break;
            }
        }

        if (operacaoMatematica != null) {
            switch (operacaoMatematica) {
                case SOMA:
                    return num1 + num2;
                case SUBTRACAO:
                    return num1 - num2;
                case MULTIPLICACAO:
                    return num1 * num2;
                case DIVISAO:
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        throw new ArithmeticException("Divisão por zero não é permitida.");
                    }
                default:
                    throw new IllegalArgumentException("Operação inválida.");
            }
        } else {
            throw new IllegalArgumentException("Símbolo de operação inválido. Use +, -, *, /.");
        }
    }
}