class clock {

    public static void main(String[] args) {


        for (int s = 0; s < 43200; s++) {

            double h = s / 120d;
            double m = (s / 10d) % 360;

            double angle = Math.abs(h - m);
            angle = round(angle);
            if (angle == 180) {
                format(s);
                s += 3600;
            }
        }
    }

    public static double round(double value) {
        value *= 10;
        value = Math.round(value);
        return value / 10d;

    }

    public static void format(int s) {
        int hour = s / 3600;
        s = s % 3600;
        int min = s / 60;
        s = s % 60;
        if (hour < 10) {
            System.out.println("0" + hour + ":" + "0" + min + ":" + s);
        }
        else System.out.println(hour + ":" + min + ":" + s);

    }

}


