package Base1;

public class Base1 {

    public static void main(String[] args) {
        Computer computer = new Computer(true);
        LenovoComputer lenovoComputer = new LenovoComputer(true);


        computer.work();
        computer.loadComputer();
        System.out.println();
        lenovoComputer.work();
        lenovoComputer.loadComputer();


    }
}
