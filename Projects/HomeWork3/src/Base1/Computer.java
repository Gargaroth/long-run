package Base1;

public class Computer extends Electronic {

    public Computer(boolean breaker) {
        super(breaker);
    }

    public void loadComputer(){
        System.out.print("Загрузка компьютера");
    }
@Override
    public final void work(){
        System.out.println("Выполняет вычесления");
    }
}
