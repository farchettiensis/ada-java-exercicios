package br.com.farchettiensis.aula1.oo;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    String nome;
    List<Double> notas;

    public Estudante() {
        this.notas = new ArrayList<>();
    }

    public Estudante(List<Double> notas) {
        this.notas = notas;
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
}