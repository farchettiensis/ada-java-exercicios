public class Personagem {
    public static void main(String... args) {
        String s = descreverHabilidadeEspecial(5);
        System.out.println(s);
    }

    public static String descreverHabilidadeEspecial(int classe) {
        return switch (classe) {
            case 1 -> "Ataque poderoso";
            case 2 -> "Lançamento de feitiço";
            case 3 -> "Tiro certeiro";
            case 4 -> "Esquiva";
            default -> "Habilidade desconhecida";
        };
//        if (classe == 1) {
//            return "Ataque poderoso";
//        } else if (classe == 2) {
//            return "Lançamento de feitiço";
//        } else if (classe == 3) {
//            return "Tiro certeiro";
//        } else if (classe == 4) {
//            return "Esquiva";
//        } else {
//            return "Habilidade desconhecida";
//        }
    }
}
