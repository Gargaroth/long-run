package Advanced1;

public class Папоротник extends Растение implements Can,Bloom {

    public Папоротник(String name) {
        super(name);
    }

    public void can() {
        System.out.println("Умеет цвести");
    }
    public  void canBloom(){
        System.out.println("Умеет цвести");
    }


    @Override
    public String toString() {
        return "Папоротник{" +
                "name='" + name + '\'' +
                '}';
    }
}

