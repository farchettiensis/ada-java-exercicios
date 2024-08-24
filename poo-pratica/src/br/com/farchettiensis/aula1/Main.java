package br.com.farchettiensis.aula1;

import br.com.farchettiensis.aula2.Estudante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        Estudante estudante = new Estudante();

        estudante.adicionaNota(6d);
        estudante.adicionaNota(8d);
        estudante.adicionaNota(5d);

        System.out.println(estudante.calcularMedia());
    }
}
