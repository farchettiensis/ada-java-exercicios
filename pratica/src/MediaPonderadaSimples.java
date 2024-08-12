public class MediaPonderadaSimples {
    public static String calculaAprovacao(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
        double somaNotasComPeso = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = somaNotasComPeso / somaPesos;

        if (mediaPonderada < 5.0) {
            return String.format("Aluno reprovado com a nota %.1f", mediaPonderada);
        } else if (mediaPonderada < 6.0) {
            return String.format("Aluno em recuperação com a nota %.1f", mediaPonderada);
        } else if (mediaPonderada < 7.0) {
            return String.format("Aluno mediano com a nota %.1f", mediaPonderada);
        } else if (mediaPonderada < 8.0) {
            return String.format("Aluno bom com a nota %.1f", mediaPonderada);
        } else if (mediaPonderada < 9.0) {
            return String.format("Aluno muito bom com a nota %.1f", mediaPonderada);
        } else {
            return String.format("Aluno excelente com a nota %.1f", mediaPonderada);
        }
    }
}
