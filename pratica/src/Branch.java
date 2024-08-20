public class Branch {

    public static void main(String[] args) {
        int[] arrayOfInts = {
                32, 87, 3, 589,
                12, 1076, 2000,
                8, 622, 127
        };
        int searchFor = 12;

        int index = searchArray(arrayOfInts, searchFor);

        if (index != -1) {
            System.out.println("Found " + searchFor + " at index " + index);
        } else {
            System.out.println(searchFor + " not in the array");
        }

        continueDemo();
    }

    static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static void continueDemo() {
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) != 'p')
                continue;

            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
