package Advanced2;

public abstract class Store {

    public static int count = 10;
    String vodka = "Vodka";


    public static int getCount() {
        count--;
        return count;

    }

    public String getVodka() {
        return vodka;
    }
}
