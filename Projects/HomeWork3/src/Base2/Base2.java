package Base2;

public class Base2 {
    public static void main(String[] args) {
        Car volvoV60 = new Volvo("black", "V60", 3, 250);
        Car volvoS90 = new Volvo("greed", "S90", 4, 200);

        Car lada2110 = new Lada("white", "2110", 4, 150 );
        Car ladaVesta = new Lada("blue", "Vesta", 3, 140 );

        Car[] cars = {volvoV60, volvoS90, lada2110, ladaVesta};
        for (Car car : cars) {
            car.makeSound();


        }


    }
}
