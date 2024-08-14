public class Triangulo {
    public static void main(String[] args) {
        int[] triangulo1 = {3, 4, 5};
        System.out.println(eUmTriangulo(triangulo1));

        int[] triangulo2 = {3, 4, 8};
        System.out.println(eUmTriangulo(triangulo2));

        int[] triangulo3 = {5, 5, 5};
        System.out.println(eUmTriangulo(triangulo3));

        int[] triangulo4 = {1, 1, 2};
        System.out.println(eUmTriangulo(triangulo4));

        int[] triangulo5 = {7, 10, 5};
        System.out.println(eUmTriangulo(triangulo5));

        int[] triangulo6 = {0, 0, 0};
        System.out.println(eUmTriangulo(triangulo6));

        int[] triangulo7 = {10, 15, 30};
        System.out.println(eUmTriangulo(triangulo7));
    }

    public static boolean eUmTriangulo(int[] input) {
        if (input.length != 3) return false;

        int a = input[0];
        int b = input[1];
        int c = input[2];

        boolean cond1 = a + b > c;
        boolean cond2 = a + c > b;
        boolean cond3 = b + c > a;

        return cond1 && cond2 && cond3;
    }
}
