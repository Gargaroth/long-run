package Advanced1;

public class Сосна extends Дерево implements Can {


    public Сосна(String name) {
        super(name);
    }

    public void can(){
        System.out.println("Умеет пахнуть");
    }
@Override
    public void haveCone(){
    System.out.println("Имеет шишки");

    }


    @Override
    public String toString() {
        return "Сосна{" +
                "name='" + name + '\'' +
                '}';
    }
}
