package Advanced1;

public class Роза extends  Растение implements Can, Bloom{

    public Роза(String name) {
        super(name);
    }

    public void can(){
        System.out.println("Умеет пахнуть");
    }

    public  void canBloom(){
        System.out.println("Умеет цвести");
    }


    @Override
    public String toString() {
        return "Роза{" +
                "name='" + name + '\'' +
                '}';
    }
}
