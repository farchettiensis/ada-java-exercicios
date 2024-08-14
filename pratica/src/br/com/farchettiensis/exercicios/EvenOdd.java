package br.com.farchettiensis.exercicios;

public class EvenOdd {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 4, 5, -1};

        for (int number : numbers) {
            try {
                validateInput(number);
                System.out.println(isEven(number));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }
        }
    }

    static String isEven(int number) {
        validateInput(number);
        if (number % 2 == 0) return String.format("The number %d is even", number);
        else return String.format("The number %d is not even", number);
    }

    static void validateInput(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }
}
