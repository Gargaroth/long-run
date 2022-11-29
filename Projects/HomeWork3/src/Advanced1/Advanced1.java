package Advanced1;

public class Advanced1 {
    public static void main(String[] args) {

        Сосна сосна = new Сосна();
        Ель ель = new Ель();
        Роза роза = new Роза();
        Папоротник папоротник = new Папоротник();

        Can[] cans = {сосна, ель, роза};

        for (Can can : cans) {
            can.can();

        }

        Bloom[] blooms = {роза, папоротник};

        for (Bloom bloom : blooms) {
            bloom.Bloom();


        }


    }


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









