package Base2;

public class Lada extends Car{

    public Lada(String color, String model, int doors, int speed) {
        super(color, model, doors, speed);
    }
    @Override
    public void makeSound(){
        System.out.println("Трынь Трынь");
    }
}
