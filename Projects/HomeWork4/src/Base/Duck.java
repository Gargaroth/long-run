package Base;

public class Duck implements Flyable{
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void Fly() {
        try {

        if (isInjured){
            throw new FlyException("Ошибка: утка ранена");
        } else {
            System.out.println("Утка летит");
        }
    } catch (FlyException e) {
//    System.out.println("Ошибка: утка ранена");

           System.out.println(e.getMessage());

        }
    }
}
