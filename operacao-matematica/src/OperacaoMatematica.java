public enum OperacaoMatematica {
    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/");

    private final String simbolo;

    OperacaoMatematica(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getOperacao() {
        return simbolo;
    }
}
