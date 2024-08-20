public class SomaAlgarismos {
    public static void main(String[] args) {
        System.out.println(somaAlgarismos(235));
        System.out.println(somaAlgarismos(121));
        System.out.println(somaAlgarismos(-1));
        System.out.println(somaAlgarismos(0));
        System.out.println(somaAlgarismos(432895834));
    }

    public static int somaAlgarismos(int input) {
        if (input > 0) {
            String numero = String.valueOf(input);
            int soma = 0;

            for (int i = 0; i < numero.length(); i++) {
                char c = numero.charAt(i);
                int digito = Character.getNumericValue(c);
                soma += digito;
            }

            return soma;
        }
        return -1;
    }
}
