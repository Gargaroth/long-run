package Advanced1;

public class Ель extends Дерево implements Can {

    public Ель(String name) {
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
        return "Ель{" +
                "name='" + name + '\'' +
                '}';
    }


}
