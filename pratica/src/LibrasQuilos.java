import java.util.Scanner;

public class LibrasQuilos {
    public static void main(String[] args) {
        double FATOR_CONVERSAO_LIBRA = 2.2046;
        double pesoEmKg = 52.4;
        double pesoEmLibras;

        pesoEmLibras = converteParaLibras(pesoEmKg, FATOR_CONVERSAO_LIBRA);

        System.out.println("Peso em KG: " + pesoEmKg);
        System.out.println("Peso em libras: " + pesoEmLibras);
    }

    static double converteParaLibras(double pesoEmKg, double fatorConversaoLibra) {
        return pesoEmKg * fatorConversaoLibra;
    }
}
