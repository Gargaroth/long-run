public class Base3 {
    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = true;
        boolean sauce = true;
        boolean toast = false;
        boolean sausage = false;
        boolean eggs = true;

        if (chicken&&vegetables&&sauce&&toast) {
            System.out.println("Цезарь подан, господа!");
        } else if (vegetables&&eggs&&(sausage||chicken)) {
            System.out.println("Оливье к вашему столу");
        } else if (vegetables) {
            System.out.println("В меню только овощной салат");
        } else {
            System.out.println("К сожаленю сейчас невозможно сделать салат(");
        }
    }
}

