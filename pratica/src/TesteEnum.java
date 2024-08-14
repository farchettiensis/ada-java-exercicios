class TesteEnum {
    public static void main(String[] args) {
//        exibeCardapio(DiasDaSemana.QUARTA);
//        System.out.println(DiasDaSemana.values()[0]);

        String parametroLinhaDecomando = args[0];
        int diaEscolhidoInt = Integer.parseInt(parametroLinhaDecomando);

        DiasDaSemana diaEscolhido = DiasDaSemana.values()[diaEscolhidoInt];
        exibeCardapio(diaEscolhido);

//        exibeCardapio(DiasDaSemana.valueOf("QUARTA"));
    }

    static void exibeCardapio(DiasDaSemana diaDaSemana) {
        System.out.println(diaDaSemana.name());
        System.out.println(diaDaSemana.ordinal());

        String cardapioDoDia = switch (diaDaSemana) {
            case SEGUNDA -> "Virado à paulista";
            case TERCA -> "Frango ao molho";
            case QUARTA -> "Feijoada";
            case QUINTA -> "Lasanha";
            case SEXTA -> "Peixe";
            case SABADO -> "Feijoada";
            case DOMINGO -> "Frango assado";
        };
        System.out.println(cardapioDoDia);
    }
}

enum DiasDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}

enum StatusPedido {
    ABERTO, PENDENTE, EM_REVISAO, FINALIZADO, REPROVADO;
}