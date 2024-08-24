package br.com.farchettiensis.aula2;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private List<Double> notas;

    public Estudante() {
        this.notas = new ArrayList<>();
    }

    public Estudante(List<Double> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionaNota(Double nota) {
        this.notas.add(nota);
    }

    public Double calcularMedia() {
        Double soma = 0d;

        for (Double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public void printarNotas() {
        notas.forEach(nota -> System.out.println());
        notas.forEach(System.out::println);
    }
}