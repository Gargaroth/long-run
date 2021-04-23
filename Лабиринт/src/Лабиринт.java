import java.util.Scanner;

public class Лабиринт {
    public static void main(String[] args) {
        char path;
        Scanner in = new Scanner(System.in);
        System.out.println("Вы попали в лабиринт Минотавра, идите вперед (s), поворачивайте направо (r) или на лево (l), чтобы выбраться наружу. Остерегайтесь приближающихся шагов ☠");
        System.out.println("Перед вами три пути, куда вы пойдете?");

        for ( ; ; ){
            path = in.next().charAt(0);

            switch (path) {
                case 's' :
                    System.out.println("Вы пошли прямо");
                    continue;

                case 'r':
                    System.out.println("Вы повернули направо");
                    continue;

                case 'l':
                    System.out.println("Вы повернули на лево");
                    continue;

                default:
                    System.out.println("Вы задумались, куда вы хотите пойти?");

            }

        }

    }

}
