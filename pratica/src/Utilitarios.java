public class Utilitarios {
    public static final double FATOR_CONVERSAO_MILHAS = 1.60934;
    public static final double FATOR_CONVERSAO_KM = 0.621371;
    public static final double VOLUME_COPO_EM_LITROS = 0.19;
    public static final double FATOR_CONVERSAO_POLEGADA_PARA_CM = 2.54;
    public static final double FATOR_KELVIN = 273.15;
    public static final int ENERGIA_MEDIA_GERADA_POR_HUMANOS_GHW = 3;

    public static double converterKmParaMilhas(double km) {
        return km * FATOR_CONVERSAO_KM;
    }

    public static double converterMilhasParaKm(double milhas) {
        return milhas * FATOR_CONVERSAO_MILHAS;
    }

    public static double calcularCoposParaEncherPiscina(double volumePiscina) {
        return volumePiscina / VOLUME_COPO_EM_LITROS;
    }

    public static boolean isPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double converterPolegadasParaCm(double polegadas) {
        return polegadas * FATOR_CONVERSAO_POLEGADA_PARA_CM;
    }

    public static double converterCmParaPolegadas(double cm) {
        return cm / FATOR_CONVERSAO_POLEGADA_PARA_CM;
    }

    public static double converterCelsiusParaKelvin(double celsius) {
        return celsius + FATOR_KELVIN;
    }

    public static double converterKelvinParaCelsius(double kelvin) {
        return kelvin - FATOR_KELVIN;
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return ((9.0 / 5.0) * celsius) + 32;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }


    public static double converterEnergiaParaHumanos (double energia) {
        return energia / ENERGIA_MEDIA_GERADA_POR_HUMANOS_GHW;
    }
}
