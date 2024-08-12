public class Revendedora {
    public static double valorProdutoFinal(double[] input) {
        double valorFinal;
        double valorImposto;
        double valorProduto = input[0];
        double estado = input[1];

        switch ((int) estado) {
            case 1:
                valorImposto = 0.07;
                break;
            case 2:
                valorImposto = 0.12;
                break;
            case 3:
                valorImposto = 0.15;
                break;
            default:
                return -1.0;
        }

        valorFinal = valorProduto + (valorProduto * valorImposto);

        return Double.parseDouble(String.format("%.4f", valorFinal));
    }

    public static void main(String[] args) {
        double[][] testCases = {
                {250.10, 1.0},
                {220.50, 2.0},
                {180.00, 3.0},
                {100.00, 1.0},
                {200.00, 2.0},
                {300.00, 3.0},
                {50.00, 1.0},
                {150.00, 2.0},
                {250.00, 3.0},
                {500.00, 1.0},
                {9999.99, 1.0}
        };

        double[] expectedResults = {
                267.6070,
                247.7640,
                207.0000,
                107.0000,
                224.00,
                345.00,
                53.50,
                168.00,
                287.50,
                535.00,
                10669.6893
        };

        for (int i = 0; i < testCases.length; i++) {
            double[] input = testCases[i];
            double result = Revendedora.valorProdutoFinal(input);
            double expected = expectedResults[i];

            boolean testPassed = Math.abs(result - expected) < 0.0001;
            System.out.printf("Test case %d: Input = [%.2f, %.1f] -> Result = %.4f (Expected = %.4f) - %s%n",
                    i + 1, input[0], input[1], result, expected,
                    testPassed ? "Passed" : "Failed");
        }
    }
}