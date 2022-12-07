package Advanced.SecondTry;

public class Clock extends Workers implements Tickable {


    public Clock(int workers, boolean broke) {
        super(workers, broke);
    }

    @Override
    public void canTick() {
        try {
            if (broke) {
                throw new WatchBrokenError("Ошибка: Часы сломались");
            } else {
                System.out.println("Часы тикают");
            }
        }catch (WatchBrokenError e){
            System.out.println(e.getMessage());
        }
    }

}
