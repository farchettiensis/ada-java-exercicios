public enum CategoriaProduto {
    ELETRONICO(1),
    VESTUARIO(2),
    ALIMENTO(3);

    private final int codigo;

    CategoriaProduto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static CategoriaProduto converteCodigo(int codigo) {
        for (CategoriaProduto categoria : CategoriaProduto.values()) {
            if (categoria.getCodigo() == codigo) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}
