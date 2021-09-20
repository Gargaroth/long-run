class clock {

    public static void main(String[] args) {


        for (int s = 0; s < 43200; s++) {

            double h = s / 120d;
            double m = (s / 10d) % 360;

            double angle = Math.abs(h - m);
            angle = round(angle);
            if (angle == 180) {
                s=format(s);
                System.out.println(s);
                s+=3600;
            }
        }
    }

    public static double round(double value) {
        value *= 10;
        value = Math.round(value);
        return value/10d;

    }

    public static double format (double  s) {
        double hour = s/3600;
        s = s%3600;
        double min = s/60;
        double sec = s%60;
        return System.out.println(hour+":"+min+":"+sec);

    }

}


