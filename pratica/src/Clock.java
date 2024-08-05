public class Clock {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (true) {
            if (hours < 10) {
                System.out.print("0");
            }
            System.out.print(hours);
            System.out.print(":");

            if (minutes < 10) {
                System.out.print("0");
            }
            System.out.print(minutes);
            System.out.print(":");

            if (seconds < 10) {
                System.out.print("0");
            }
            System.out.print(seconds);
            System.out.println();

            seconds += 1;

            if (seconds > 59) {
                minutes += 1;
                seconds = 0;

                if (minutes > 59) {
                    hours += 1;
                    minutes = 0;
                }

                if (hours > 23) {
                    hours = 0;
                }
            }
        }
    }
}
