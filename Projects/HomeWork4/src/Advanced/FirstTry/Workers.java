package Advanced.FirstTry;



public class Workers extends Store implements Haveable{

    public boolean broke;

    public Workers(boolean broke) {
        this.broke = broke;
    }

    public boolean isBroke() {
        return broke;
    }

    public void setBroke(boolean broke) {
        this.broke = broke;
    }

    @Override
    public void have() {

    }
}
