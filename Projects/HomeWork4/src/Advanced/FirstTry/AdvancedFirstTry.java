package Advanced.FirstTry;


public class AdvancedFirstTry {
    public static void main(String[] args) {

        Clock clock = new Clock(true);

        Workers[] workers1 = new Workers[]{clock};
        Workers[] workers2 = new Workers[]{clock};

        Store[][] store1 = new Store[][]{workers1};
        Store[][] store2 = new Store[][]{workers2};

        Brand[][][] brand = new Brand[][][]{store1,store2};

        for (Brand[][] brands : brand) {
            for (Workers workers : workers1) {
                clock.setBroke(false);
                clock.canTick();
            }
            for (Workers workers : workers2) {
                clock.setBroke(true);
                clock.canTick();
            }
            break;
        }

    }

}






