package Advanced.SecondTry;


public class Workers extends Store {
    public boolean broke;

    public Workers(int workers, boolean broke) {
        super(workers);
        this.broke = broke;
    }

    public boolean isBroke() {
        return broke;
    }

    public void setBroke(boolean broke) {
        this.broke = broke;
    }



}
