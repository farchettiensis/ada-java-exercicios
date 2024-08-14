public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(geraSequenciaFibonacci(0));
        System.out.println(geraSequenciaFibonacci(1));
        System.out.println(geraSequenciaFibonacci(2));
        System.out.println(geraSequenciaFibonacci(3));
        System.out.println(geraSequenciaFibonacci(4));
        System.out.println(geraSequenciaFibonacci(5));
        System.out.println(geraSequenciaFibonacci(6));
        System.out.println(geraSequenciaFibonacci(7));
        System.out.println(geraSequenciaFibonacci(8));
        System.out.println(geraSequenciaFibonacci(9));
        System.out.println(geraSequenciaFibonacci(10));
        System.out.println(geraSequenciaFibonacci(100));
    }

    public static String geraSequenciaFibonacci(int input) {
        if (input < 0) return "";
        if (input == 0) return "0";

        int[] sequenciaFibonacci = new int[100];
        int contador = 0;
        String sequencia = "";

        sequenciaFibonacci[0] = 0;
        sequenciaFibonacci[1] = 1;

        for (int i = 2; true; i++) {
            sequenciaFibonacci[i] = sequenciaFibonacci[i - 1] + sequenciaFibonacci[i - 2];
            if (sequenciaFibonacci[i] > input) {
                break;
            }
            contador = i;
        }

        for (int i = 0; i <= contador; i++) {
            sequencia += sequenciaFibonacci[i];
            if (i < contador) {
                sequencia += ", ";
            }
        }

        return sequencia;
    }
}

/* Usando while para gerar a sequência Fibonacci
public static String geraSequenciaFibonacci(int input) {
    if (input < 0) return "";
    if (input == 0) return "0";

    int[] sequenciaFibonacci = new int[50];
    int contador = 1;  // Start from 1 since we have 0 and 1 predefined
    String sequencia = "";

    sequenciaFibonacci[0] = 0;
    sequenciaFibonacci[1] = 1;

    while (true) {
        int nextValue = sequenciaFibonacci[contador] + sequenciaFibonacci[contador - 1];
        if (nextValue > input) {
            break;
        }
        contador++;
        sequenciaFibonacci[contador] = nextValue;
    }

    for (int i = 0; i <= contador; i++) {
        sequencia += sequenciaFibonacci[i];
        if (i < contador) {
            sequencia += ", ";
        }
    }

    return sequencia;
}
 */