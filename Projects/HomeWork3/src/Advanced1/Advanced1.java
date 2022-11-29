package Advanced1;

public class Advanced1 {
    public static void main(String[] args) {

        Сосна сосна = new Сосна("сосна");
        Ель ель = new Ель("ель");
        Роза роза = new Роза("роза");
        Папоротник папоротник = new Папоротник("папоротник");

        Can[] cans = {сосна, ель, роза};

        for (Can can : cans) {
            System.out.println(can);
            can.can();


        }

        Bloom[] blooms = {роза, папоротник};
        for (Bloom bloom : blooms) {
            System.out.println(bloom);
            bloom.canBloom();


        }


    }

    public static void canSmell() {
//        Дерево сосна = new Сосна();
//        Дерево ель = new Ель();
//
//        Растение роза = new Роза();
//        Растение папоротник = new Папоротник();
//
//
//        Дерево[] tree = {сосна, ель};
//
//        Растение[] herb = {роза, папоротник};
//
        }


}









