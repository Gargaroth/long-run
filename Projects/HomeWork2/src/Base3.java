public class Base3 {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(30,true);

        Dragon dragon = new Dragon(20, 50);

        dragon.setJaws(10);
        dragon.setWingspan(100);
        sheep.setFur(400);
        sheep.setHorns(false);

        int jaws = dragon.getJaws();
        int wingspan = dragon.getWingspan();
        int fur = sheep.getFur();
        boolean horns = sheep.isHorns();


//        System.out.println(dragon.wingspan);
//        System.out.println(dragon.jaws);
//        System.out.println(sheep.fur);
//        System.out.println(sheep.horns);
//        System.out.println(horns);
        System.out.println(dragon);
        System.out.println(sheep);




    }
}
