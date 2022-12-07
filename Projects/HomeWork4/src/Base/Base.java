package Base;

public class Base {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);

        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        Flyable[] flyables = {duck1, duck2, airplane1, airplane2};
        for (Flyable flyable : flyables) {
            flyable.Fly();

        }


    }
}
