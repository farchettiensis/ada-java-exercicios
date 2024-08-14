public class MediaAproveitamento {
    public static String mediaAproveitamento(double[] input) {
        double notaUm = input[0];
        double notaDois = input[1];
        double notaTres = input[2];
        double mediaExercicios = input[3];

        double mediaAproveitamento = (notaUm + notaDois * 2 + notaTres * 3 + mediaExercicios) / 7;

        if (mediaAproveitamento >= 9.0) {
            return "A";
        } else if (mediaAproveitamento >= 7.5) {
            return "B";
        } else if (mediaAproveitamento >= 6.0) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void main(String[] args) {
        double[] notas1 = {8.0, 7.0, 8.0, 8.0};
        System.out.println(mediaAproveitamento(notas1));

        double[] notas2 = {5.0, 4.3, 8.0, 7.0};
        System.out.println(mediaAproveitamento(notas2));
    }
}
