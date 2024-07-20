import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salariosBrutos = new double[5];
        double[] salariosLiquidos = new double[5];
        double[] descontosINSS = new double[5];
        double[] descontosIR = new double[5];

        for (int contador = 0; contador < salariosBrutos.length; contador++) {
            boolean salarioBrutoValido = false;
            while (!salarioBrutoValido) {
                try {
                    System.out.println("Forneça um salário bruto (" + (contador + 1) + "): ");
                    double salarioBruto = Double.parseDouble(scanner.nextLine());

                    if (salarioBruto <= 0) {
                        throw new ArithmeticException("Erro: o valor deve ser positivo e acima de zero.");
                    }

                    salariosBrutos[contador] = salarioBruto;

                    double descontoINSS = calculaDescontoINSS(salarioBruto);
                    descontosINSS[contador] = descontoINSS;

                    double descontoIR = calculaDescontoIR(salarioBruto);
                    descontosIR[contador] = descontoIR;

                    double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
                    salariosLiquidos[contador] = salarioLiquido;

                    salarioBrutoValido = true;
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Erro: valor inválido.");
                }
            }
        }
        scanner.close();

        imprimeValores(salariosBrutos, descontosINSS, descontosIR, salariosLiquidos);
    }

    public static double calculaDescontoINSS(double salarioBruto) {
        if (salarioBruto <= 1212) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 3641.03) {
            return salarioBruto * 0.12;
        } else {
            return salarioBruto * 0.14;
        }
    }

    public static double calculaDescontoIR(double salarioBruto) {
        if (salarioBruto <= 1903.98) {
            return 0;
        } else if (salarioBruto <= 2826.65) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 3751.05) {
            return salarioBruto * 0.15;
        } else if (salarioBruto <= 4664.68) {
            return salarioBruto * 0.225;
        } else {
            return salarioBruto * 0.275;
        }
    }

    public static void imprimeValores(double[] salariosBrutos, double[] descontosINSS, double[] descontosIR, double[] salariosLiquidos) {
        for (int contador = 0; contador < salariosBrutos.length; contador++) {
            System.out.printf("Salário bruto (%d): %.2f%n", contador + 1, salariosBrutos[contador]);
            System.out.printf("Desconto INSS (%d): %.2f%n", contador + 1, descontosINSS[contador]);
            System.out.printf("Desconto IR (%d): %.2f%n", contador + 1, descontosIR[contador]);
            System.out.printf("Salário líquido (%d): %.2f%n", contador + 1, salariosLiquidos[contador]);
            System.out.println();
        }
    }
}
