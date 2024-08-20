public class Array2 {
    public static void main(String[] args) {
        String[][] array = new String[10][];
        array[0] = new String[2];
        array[1] = new String[4];
        array[2] = new String[10];

        for(String[] j : array) {
            System.out.println(j.length);
        }

//        System.out.println(array[0].length);
    }
}
