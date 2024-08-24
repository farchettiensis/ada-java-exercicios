package br.com.farchettiensis.aula2.curso;

public class CursoPresencial extends Curso {
    public String endereco;

    public CursoPresencial(String nome, String instrutor, Integer duracao, String endereco) {
        super(nome, instrutor, duracao);
        this.endereco = endereco;
    }
}
