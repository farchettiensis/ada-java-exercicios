public class TratamentoDeErros {
    public static void main(String[] args) {
        int resultadoDaFuncao = realizaDivisao(5, 2);
        System.out.println(resultadoDaFuncao);
    }

    static int realizaDivisao(int n1, int n2) {
        try {
            Integer.parseInt("a");
            return n1 / n2;
        } catch (ArithmeticException e) {
            return 0;
        } catch (NumberFormatException e) {
            return -2;
        } catch (RuntimeException e) {
            return -1;
        }  catch (Exception e) {
            e.printStackTrace();
            return -3;
        }
    }
}
