package Advanced1;

public class Роза extends  Растение implements Can, Bloom{



    public void can(){
        System.out.println("Роза - Умеет пахнуть");
    }

    public  void Bloom(){
        System.out.println("Роза - Умеет цвести");
    }



}
