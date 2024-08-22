package br.com.farchettiensis.aula1.oo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        Estudante estudante = new Estudante();
        estudante.nome = "Jamil";

        estudante.adicionaNota(6d);
        estudante.adicionaNota(8d);
        estudante.adicionaNota(5d);

        System.out.println(estudante.calcularMedia());
    }
}
