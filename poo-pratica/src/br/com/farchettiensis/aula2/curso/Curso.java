package br.com.farchettiensis.aula2.curso;

public class Curso {
    public String nome;
    public String instrutor;
    public Integer duracao;

    public Curso(String nome, String instrutor, Integer duracao) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.duracao = duracao;
    }

    public void detalharCurso() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Instrutor: %s%n", this.instrutor);
        System.out.printf("Duração: %d%n", this.duracao);
    }
}
