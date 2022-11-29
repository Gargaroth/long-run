package Base1;

public abstract class Electronic {
    boolean breaker;


    public Electronic(boolean breaker) {
        this.breaker = breaker;
    }

    public void setBreaker(boolean breaker) {
        this.breaker = breaker;
    }

    public boolean isBreaker() {
        return breaker;
    }

    public abstract void work();

}
