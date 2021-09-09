public class clock {
    public static void main(String[] args) {
        for (; ; ) {
            for (int sec = 1; sec <= 60; sec++) {
                System.out.println(sec);
                if (sec == 60)
                for (int hour = 1; hour<=24; hour++){
                    System.out.println(hour);

            }
        }
    }
}
}