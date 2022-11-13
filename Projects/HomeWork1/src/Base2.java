public class Base2 {
    public static void main(String[] args) {
        int ageChildren = 8;
        if (ageChildren <= 6) {
            System.out.println("Пошел в сад");
        } else if (ageChildren <= 11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren <= 17) {
            System.out.println("Пошел в среднюю школу");
        } else {
            System.out.println("Пошел в университет");
        }
    }
}
