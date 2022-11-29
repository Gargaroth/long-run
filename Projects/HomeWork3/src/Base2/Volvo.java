package Base2;

public class Volvo extends Car  {

    public Volvo(String color, String model, int doors, int speed) {
        super(color, model, doors, speed);
    }
    @Override
    public void makeSound(){
        System.out.println("БИИИ БИИИ");
    }
}
