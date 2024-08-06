package br.com.farchettiensis.utilitarios;

public class UtilitariosConversao {
    public static final double FATOR_CONVERSAO_KELVIN = 273.15;
    public static final double FATOR_CONVERSAO_PARA_MILHAS = 1.60934;

    public static double converteKmParaMilhas(double km) {
        return km / FATOR_CONVERSAO_PARA_MILHAS;
    }

    public static double converteMilhasParaKm(double milhas) {
        return milhas * FATOR_CONVERSAO_PARA_MILHAS;
    }

    public static double converteCelsiusParaKelvin(double celsius) {
        return celsius + FATOR_CONVERSAO_KELVIN;
    }

    public static double converteKelvinParaCelsius(double kelvin) {
        return kelvin - FATOR_CONVERSAO_KELVIN;
    }

    public static double converteCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static double converteFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}
