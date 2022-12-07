package Advanced.FirstTry;

public class Clock extends Workers {


    public Clock(boolean broke) {
        super(broke);
    }


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
