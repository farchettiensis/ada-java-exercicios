public class Gincana {
    public static void main(String[] args) {
        String[] input1 = {"as", "mas", "amor", "amoreco"};
        String[] result1 = substringStr(input1);
        for (String str : result1) {
            System.out.println(str);
        }

        String[] input2 = {"carro", "ca", "paz", "pá"};
        String[] result2 = substringStr(input2);
        for (String str : result2) {
            System.out.println(str);
        }
    }

    public static String[] substringStr(String[] input) {
        if (input == null) {
            return new String[0];
        }

        int tamanho = input.length;
        String[] array = new String[tamanho];
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i != j && input[j].contains(input[i])) {
                    array[contador] = input[i];
                    contador++;
                    break;
                }
            }
        }

        String[] resultado = new String[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = array[i];
        }

        return resultado;
    }
}
