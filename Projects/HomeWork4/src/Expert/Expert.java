package Expert;

public class Expert {
    public static void main(String[] args) {
        Car car = new Car(5000);
        Car car1 = new Car(-100);

        Cost cost = new CarShopDecorator(car);
        cost.getPrice();



    }
}
