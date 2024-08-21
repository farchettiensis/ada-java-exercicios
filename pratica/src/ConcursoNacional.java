public class ConcursoNacional {
    public static void main(String[] args) {
        String[] teste1 = soletrandoInvertidoStr("amor");
        for (int i = 0; i < teste1.length; i++) {
            System.out.print(teste1[i] + " ");
        }
        System.out.println();

        String[] teste2 = soletrandoInvertidoStr("carro");
        for (int i = 0; i < teste2.length; i++) {
            System.out.print(teste2[i] + " ");
        }
        System.out.println();
    }

    public static String[] soletrandoInvertidoStr(String input) {
        if (input == null) {
            return new String[0];
        }

        int tamanho = input.length();
        String[] array = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = String.valueOf(input.charAt(tamanho - i - 1));
        }

        return array;
    }
}
