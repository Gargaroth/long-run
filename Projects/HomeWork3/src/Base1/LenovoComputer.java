package Base1;

public final class LenovoComputer extends Computer {


    public LenovoComputer(boolean breaker) {
        super(breaker);
    }
@Override
    public  void loadComputer(){
        System.out.println("Загрузка Lenovo");
    }
}
