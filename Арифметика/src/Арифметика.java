import java.util.Scanner;

public class Арифметика {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = x.nextDouble();
        System.out.println("Введите второе число: ");
        double b = x.nextDouble();

        Scanner z = new Scanner(System.in);
        System.out.println("Что вы хотели бы следать: Сложить, Вычесть, Умножить, Разделить? ");
        String q = z.next();

        switch (q) {

            case "Сложить": {
                System.out.println(a + b);
                break;
            }
            case "Вычесть": {
                System.out.println(a - b);
                break;
            }
            case "Умножить": {
                System.out.println(a * b);
                break;
            }
            case "Разделить": {
                System.out.println(a / b);
                break;
            }
            default: {
                System.out.println("Неверная команда, повторите операцию!");
            }
            }
        }
    }

