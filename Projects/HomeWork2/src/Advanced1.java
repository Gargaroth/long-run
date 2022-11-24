public class Advanced1 {

    public static void main(String[] args) {

        double increment = 0.01123;
        double result = 0;
        int count = 0;

        while (result < 1000000){

            if (increment >= 0) {

                result = result + increment;
                count++;

            } else {
                break;
            }

        }
        if (increment >= 0) {

            System.out.println(count);

        }

    }

}
