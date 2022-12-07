package Advanced.SecondTry;



public class AdvancedSecondTry {
    public static void main(String[] args) {
        Clock clock = new Clock(1,true);

        Workers workers1 = new Workers(1,true);
        Workers workers2 = new Workers(1,true);

        Store[] store1 = new Store[]{workers1};
        Store[] store2 = new Store[]{workers2};

        Brand[][] brand = new Brand[][]{store1,store2};
        for (Brand[] brands : brand) {
            if (workers1 instanceof Brand) {
                clock.setBroke(false);
                clock.canTick();
            }
            if (workers2 instanceof Brand){
                clock.setBroke(true);
                clock.canTick();
            }
        break;

    }
    }
}
