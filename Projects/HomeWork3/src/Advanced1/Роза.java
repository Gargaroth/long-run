package Advanced1;

public class Роза extends  Растение implements Can, Bloom{



    public void can(){
        System.out.println("Роза - Умеет пахнуть");
    }

    public  void canBloom(){
        System.out.println("Роза - Умеет цвести");
    }



}
