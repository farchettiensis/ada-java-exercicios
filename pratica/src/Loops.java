public class Loops {
    public static void main(String[] args) {
        /*
        do {
            System.out.println("Hello World");
        } while (args[0].equals("Continue"));

        int i = 1;
        while (i < 11) {
            System.out.println("Contagem: " + i);
            i++;
        }

        for (i = 1; i < 11; i++) {
            System.out.println("Contagem: " + i);
        }


        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        */

        for (String arg : args) {
            System.out.println(arg);
        }

    }
}
