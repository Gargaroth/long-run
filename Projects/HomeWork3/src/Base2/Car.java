package Base2;

public abstract class Car {
    String color;
    String model;
    int doors;
    int speed;

    public Car(String color, String model, int doors, int speed) {
        this.color = color;
        this.model = model;
        this.doors = doors;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public int getSpeed() {
        return speed;
    }
    public abstract void makeSound();

}
