package Advanced2;

public class Advanced2 {
    public static void main(String[] args) {

        Workers worker1 = new Workers("Semen");
        Workers worker2 = new Workers("Vladislav");
        Workers worker3 = new Workers("Georgy");

        Workers[] workers = {worker1, worker2, worker3};
        for (Workers worker : workers) {
            worker.getProduct();

        }


    }
}
